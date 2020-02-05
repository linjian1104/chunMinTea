package com.liulei.dao;

import com.liulei.entity.StaffInfo;
import com.liulei.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StaffClientDao {
      //1.查询员工信息
      @Select("select * from joinuser where telephone = '${telephone}'")
      public User selectAll_info(@Param("telephone") String telephone);
      //登录验证 根据电话 密码
      @Select("select * from joinuser where telephone = '${telephone}' and password = '${password}'" )
      public int login(@Param("telephone")String telephone,@Param("password") String password);
      /**
       * 2.保存员工的打卡信息
       * */
      @Insert("insert into staff value (null,#{telephone},#{checkInDay},#{checkInYear},#{checkInMonth})")
      public int saveCheckInTime(StaffInfo staffInfo);

      /**
       * 3.查询员工信息
       * */
      @Select("select * from staff where telephone = '${telephone}' and checkInYear = '${year}' and checkInMonth = '${month}'")
      public StaffInfo selectStaff(@Param("telephone") String telephone,@Param("year")String year,@Param("month") String month);

      /**
       * 4.修改打卡信息
       * */
      @Update("update staff set checkInDay = #{checkInDay} where checkInYear = #{checkInYear} and checkInMonth=#{checkInMonth} and telephone = #{telephone}")
      int update(StaffInfo staffInfo);

      /**
       * 5.根据电话号码查询打卡员工信息
       * */
      @Select("select * from staff where telephone = '${telephone}'")
      public List<StaffInfo> selectByTelephone(@Param("telephone") String telephone);

      //6.查询电话是否存在
      @Select("select * from joinuser where telephone = '${telephone}'")
      public User select_phone(@Param("telephone") String telephone);

      //7.密码修改
      @Update("update joinuser set password = '${newPassword}'where telephone = '${telephone}'")
      public int update_pwd(@Param("telephone")String telephone,@Param("newPassword") String newPassword);
}
