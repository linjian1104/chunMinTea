package com.liulei.entity;

/**
 * @author: liulei
 * @date: 2019/12/13 14:07
 * @describe:
 */
public class StaffInfo {
    private int staffid;
    private String telephone;
    private String checkInDay;
    private String checkInYear;
    private String checkInMonth;

    @Override
    public String toString() {
        return "StaffInfo{" +
                "staffid=" + staffid +
                ", telephone='" + telephone + '\'' +
                ", checkInDay='" + checkInDay + '\'' +
                ", checkInYear='" + checkInYear + '\'' +
                ", checkInMonth='" + checkInMonth + '\'' +
                '}';
    }

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCheckInDay() {
        return checkInDay;
    }

    public void setCheckInDay(String checkInDay) {
        this.checkInDay = checkInDay;
    }

    public String getCheckInYear() {
        return checkInYear;
    }

    public void setCheckInYear(String checkInYear) {
        this.checkInYear = checkInYear;
    }

    public String getCheckInMonth() {
        return checkInMonth;
    }

    public void setCheckInMonth(String checkInMonth) {
        this.checkInMonth = checkInMonth;
    }
}
