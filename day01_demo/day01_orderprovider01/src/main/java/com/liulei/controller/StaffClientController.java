package com.liulei.controller;


import com.alibaba.fastjson.JSON;
import com.liulei.service.StaffClientService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: liulei
 * @date: 2019/12/12 10:14
 * @describe:
 */
@RestController
@RequestMapping("staClient")
public class StaffClientController {
    @Autowired
    private StaffClientService staffClientService;
    //1.根据用户名和电话号码查询员工信息
    @RequestMapping("selectInfo/telephone={telephone}")
    @ResponseBody
    public String userInfo(Map<String,Object> map,@PathVariable("telephone") String telephone){
        map.put("userInfo",staffClientService.selectAll_info(telephone));
        return JSON.toJSONString(map);
    }
    //2.登录验证 根据电话 密码
    @RequestMapping("login/telephone={telephone}&password={password}")
    @ResponseBody
    public boolean login(@PathVariable("telephone") String telephone,@PathVariable("password") String password){
        return  staffClientService.login(telephone,password);
    }

    //3.保存用户的打卡时间
    @RequestMapping("check/time={time}&username={username}")
    @ResponseBody
    public boolean saveCheckInTime(@PathVariable("time") String time,@PathVariable("username") String username){
        return  staffClientService.saveCheckInTime(time,username);
    }

    /**
     * 根据电话号码查询打卡员工信息
     */
    @RequestMapping("selectByTelephone/username={username}")
    @ResponseBody
    public String selectByTelephone(Map<String,Object> map ,@PathVariable("username") String username) {
        map.put("checkIn",staffClientService.selectByTelephone(username));
        return JSON.toJSONString(map);
    }

    //4.获取验证码
    @RequestMapping("getYzm/telephone={telephone}")
    @ResponseBody
    public String yzm(Map<String,Object>map,@PathVariable("telephone")String telephone){
        //1.生产六位数的随机数
        int s = (int)(Math.random()*1000000);
        String dxs = String.valueOf(s);
        //2.判断电话号码是否存在
          //2.1不存在
        if(staffClientService.select_phone(telephone)==null){
            return  "fail";
        }
        //2.2存在，发送短信 获取验证码
        this.getRequest(dxs,telephone);
        map.put("dx_yzm",dxs);
        return JSON.toJSONString(map);
    }
    //5.密码修改
    @RequestMapping("update_pwd/telephone={telephone}&newPassword={newPassword}")
    @ResponseBody
    public boolean update_pwd(@PathVariable("telephone")String telephone,@PathVariable("newPassword")String newPassword){
        //1.判断电话号码是否存在
        //1.1不存在 false
        if(staffClientService.select_phone(telephone)==null){
           return  false;
        }
        //2.判断密码是否为空
        //2.1为空 false
        if (newPassword==null){
            return false;
        }
        //3.电话、密码都正确，修改密码，新密码替换旧密码
        staffClientService.update_pwd(telephone,newPassword);
        return true;
    }


    //短信验证码程序
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
    //49dd625cdfbed985af57ec681bd72672  520c937c556ee071f45ca838ec60cd96 JSONObject.fromObject(result);
    //配置您申请的KEY
    public static final String APPKEY ="f83f5abf99bf64353ba359b5031e2c38";
    //2.发送短信
    public static void getRequest(String dxs,String telephone){
        String result =null;
        String url ="http://v.juhe.cn/sms/send";//请求接口地址
        Map params = new HashMap();//请求参数
        params.put("mobile",telephone);//接收短信的手机号码
        params.put("tpl_id","179244");//短信模板ID，请参考个人中心短信模板设置
        params.put("tpl_value","#code#="+dxs);//变量名和变量值对。如果你的变量名或者变量值中带有#&=中的任意一个特殊符号，请先分别进行urlencode编码后再传递，<a href="http://www.juhe.cn/news/index/id/50" target="_blank">详细说明></a>
        params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
        params.put("dtype","");//返回数据的格式,xml或json，默认json

        try {
            result =net(url, params, "GET");
            JSONObject object = JSONObject.fromObject(result);
            if(object.getInt("error_code")==0){
            }else{
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     *
     * @param strUrl 请求地址
     * @param params 请求参数
     * @param method 请求方法
     * @return  网络请求字符串
     * @throws Exception
     */
    public static String net(String strUrl, Map params,String method) throws Exception {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            StringBuffer sb = new StringBuffer();
            if(method==null || method.equals("GET")){
                strUrl = strUrl+"?"+urlencode(params);
            }
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            if(method==null || method.equals("GET")){
                conn.setRequestMethod("GET");
            }else{
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            if (params!= null && method.equals("POST")) {
                try {
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                    out.writeBytes(urlencode(params));
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }

    //将map型转为请求参数型
    public static String urlencode(Map<String,Object>data) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }


}
