package com.liulei.service.impl;

import com.liulei.dao.StaffClientDao;
import com.liulei.entity.StaffInfo;
import com.liulei.entity.User;
import com.liulei.service.StaffClientService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: liulei
 * @date: 2019/12/12 10:12
 * @describe:
 */
@Service("StaffClientService")
public class StaffClientServiceImpl implements StaffClientService {
    @Autowired
    private StaffClientDao staffClientDao;
    //1.查询员工信息
    @Override
    public User selectAll_info( String telephone) {
        return staffClientDao.selectAll_info(telephone);
    }
    //2.登录验证 根据电话 密码
    @Override
    public boolean login(String telephone, String password) {
       try{
           staffClientDao.login(telephone,password);
           return true;
       }catch (Exception e){

       }
        return false;
    }
    /**
     * 保存员工的打卡信息
     * */
    @Override
    public boolean saveCheckInTime(String time, String username) {
        String times[] = time.split("-");
        for (String s : times) {
        }
        StaffInfo staffInfo = staffClientDao.selectStaff(username,times[0],times[1]);
        int num = 0;
       try {
           if(staffInfo==null){
               staffInfo = new StaffInfo();
               staffInfo.setTelephone(username);
               staffInfo.setCheckInDay(times[2]);
               staffInfo.setCheckInYear(times[0]);
               staffInfo.setCheckInMonth(times[1]);
           }else{
               String checkInDay = staffInfo.getCheckInDay();
               staffInfo.setCheckInDay(checkInDay+","+times[2]);
                staffClientDao.update(staffInfo);
               num =  staffClientDao.update(staffInfo);
           }
       }catch(Exception e){
            e.printStackTrace();
       }
       if(num>0){
           return true;
       }

    return false;
    }

    /**
     * 根据电话号码查询打卡员工信息
     */
    @Override
    public List<StaffInfo> selectByTelephone(@Param("telephone") String telephone) {
        return staffClientDao.selectByTelephone(telephone);
    }
    //5.查询电话是否存在
    @Override
    public User select_phone(String telephone) {
        return staffClientDao.select_phone(telephone);
    }
    //6.密码修改
    @Override
    public boolean update_pwd(String telephone, String newPassword) {
        if (staffClientDao.update_pwd(telephone,newPassword)>0){
            return true;
        }
        return false;
    }
}

