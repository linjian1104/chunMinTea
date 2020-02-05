package com.liulei.service;

import com.liulei.entity.StaffInfo;
import com.liulei.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StaffClientService {
    //1.查询员工信息
    public User selectAll_info(String telephone);
    //2.登录验证 根据电话 密码
    public boolean login(@Param("telephone")String telephone, @Param("password") String password);
    /**
     * 3.保存员工的打卡信息
     * */
    public boolean saveCheckInTime(
            @PathVariable("time") String time,
            @PathVariable("username") String username);

    /**
     * 4.根据电话号码查询打卡员工信息
     * */
    public List<StaffInfo> selectByTelephone(@Param("telephone") String telephone);

    //5.查询电话是否存在
    public User select_phone(@Param("telephone") String telephone);

    //6.密码修改
    public boolean update_pwd(@Param("telephone")String telephone,@Param("newPassword") String newPassword);

}
