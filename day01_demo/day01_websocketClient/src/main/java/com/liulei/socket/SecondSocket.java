package com.liulei.socket;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ServerEndpoint("/websocket/{username}")
public class SecondSocket {
    private static Map<Integer,String> map = new HashMap<Integer,String>();
    private static int num = 0;
    private static String name=null;
    private static int count=0;
    //定义转发地址常量
    private static final String URL="http://localhost:8086/orderList/saveOrder/";
//    @Autowired
//    private RestTemplate restTemplate;
    private static final RestTemplate restTemplate = new RestTemplate();
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 在线人数
     */

    public static int onlineNumber = 0;

    /**
     * 以用户的姓名为key，WebSocket为对象保存起来
     */
    private static Map<String, SecondSocket> clients = new ConcurrentHashMap<String, SecondSocket>();
    /**
     * 会话
     */
    private Session session;
    /**
     * 用户名称
     */
    private String username;

    /**
     * 建立连接
     *
     * @param session
     */
    @OnOpen
    public void onOpen(@PathParam("username") String username, Session session) throws IOException {
        onlineNumber++;
        logger.info("现在来连接的客户id：" + session.getId() + "用户名：" + username);
        this.username = username;
        this.session = session;
        if(username.length()==11){
            map.put(count++,username);
        }
        logger.info("有新连接加入！ 当前在线人数" + onlineNumber);
//        try {
//            //messageType 1代表上线 2代表下线 3代表在线名单 4代表普通消息
//            //先给所有人发送通知，说我上线了
//            Map<String, Object> map1 = new HashMap<String, Object>();
////            map1.put("messageType", 1);
////            map1.put("username", username);
////            sendMessageAll(JSON.toJSONString(map1), username);
//
//            //把自己的信息加入到map当中去
            clients.put(username, this);
//
//            //给自己发一条消息：告诉自己现在都有谁在线
////            Map<String, Object> map2 = new HashMap<String, Object>();
////            map2.put("messageType", 3);
//
//            //移除掉自己
////            Set<String> set = clients.keySet();
////            map2.put("onlineUsers", set);
//            sendMessageTo("songmingjie", "24");
//        } catch (IOException e) {
//            logger.info(username + "上线的时候通知所有人发生了错误");
//        }
    }

    @OnError
    public void onError(Session session, Throwable error) {
        logger.info("服务端发生了错误" + error.getMessage());
        //error.printStackTrace();
    }

    /**
     * 连接关闭
     */
    @OnClose
    public void onClose() {
        onlineNumber--;
        //webSockets.remove(this);
        clients.remove(username);
        try {
            //messageType 1代表上线 2代表下线 3代表在线名单  4代表普通消息
            Map<String, Object> map1 = new HashMap<String, Object>();
            map1.put("messageType", 2);
            map1.put("onlineUsers", clients.keySet());
            map1.put("username", username);
            sendMessageAll(JSON.toJSONString(map1), username);
        } catch (IOException e) {
            logger.info(username + "下线的时候通知所有人发生了错误");
        }
        logger.info("有连接关闭！ 当前在线人数" + onlineNumber);
    }

    /**
     * 收到客户端的消息
     *
     * @param message 消息
     * @param session 会话
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        try {
            logger.info("来自客户端消息：" + message + "客户端的id是：" + session.getId());
//                JSONArray objects = JSON.parseArray(message);
//                JSONObject jsonObject = (JSONObject) objects.get(0);
//            System.out.println(jsonObject.getString("status"));
            String encode = URLEncoder.encode(message);
            restTemplate.getForObject(URL+"message="+encode,String.class);
//            JSONObject jsonObject = JSON.parseObject(message);
//            System.out.println(jsonObject);
//            System.out.println(jsonObject.getString("status"));
//            System.out.println(jsonObject.getString("list"));
//            System.out.println(jsonObject.toJSONString());
//            String textMessage = jsonObject.getString("message");
//            String fromusername = jsonObject.getString("username");
//            String tousername = jsonObject.getString("to");
//            String touserPhoto = jsonObject.getString("touserPhoto");
            //如果不是发给所有，那么就发给某一个人

            //messageType 1代表上线 2代表下线 3代表在线名单  4代表普通消息

//            Map<String, Object> map1 = new HashMap<String, Object>();
//            map1.put("messageType", 4);

//            map1.put("textMessage", textMessage);
//            map1.put("fromusername", fromusername);
//            map1.put("touserPhoto", touserPhoto);

//            if (tousername.equals("All")) {
//                map1.put("tousername", "所有人");
//
//                sendMessageAll(JSON.toJSONString(map1), fromusername);
//
//            } else {
//
//                map1.put("tousername", tousername);
//
//            System.out.println(username);
            String username2 = null;
//            for (SecondSocket item : clients.values()) {
//                System.out.println("username:"+item.username);
//                if (item.username.length()==11) {
//                    map.put(count,item.username);
//                    count++;
//                }
//            }
           if(map.size()==1){
               username2= map.get(0);
           }else{
               if(num==0){
                   username2= map.get(num);
                   num++;
               }else{
                   username2 = map.get(num);
                   num = 0;
               }
           }
            sendMessageTo(message, username2);
//
//            }
        } catch (Exception e) {
                    e.printStackTrace();
//            logger.info("发生了错误了");

        }
    }

    public void sendMessageTo(String message, String ToUserName) throws IOException {

        for (SecondSocket item : clients.values()) {
            if (item.username.equals(ToUserName)) {
                item.session.getAsyncRemote().sendText(message);
                /**
                 *  getBasicRemote()  阻塞式 同步
                 *  getAsyncRemote() 非阻塞式 异步
                 */

                break;

            }
        }

    }

    public void sendMessageAll(String message, String FromUserName) throws IOException {
        for (SecondSocket item : clients.values()) {
            System.out.println(2);
            System.out.println(item.session.getAsyncRemote());
            item.session.getAsyncRemote().sendText(message);
        }

    }

    public static synchronized int getOnlineCount() {

        return onlineNumber;

    }
}