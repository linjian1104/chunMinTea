package com.liulei.entity;

/**
 * @作者: 闵润
 * @日期: 2019/11/26 10:28
 * @描述:
 */
public class User {
    private int id;
    private String name;
    private String password;
    private String six;
    private int age;
    private String telephone;
    private String cardId;
    private String joinDate;
    private String exitDate;
    private int realm;
    private int workDay;
    private int status;
    private int realDay;
    private int absenteeism;
    private String statusDate;
    private String absenteeismDate;
    private String localMap;
    private String yearDay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getExitDate() {
        return exitDate;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }

    public int getRealm() {
        return realm;
    }

    public void setRealm(int realm) {
        this.realm = realm;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRealDay() {
        return realDay;
    }

    public void setRealDay(int realDay) {
        this.realDay = realDay;
    }

    public int getAbsenteeism() {
        return absenteeism;
    }

    public void setAbsenteeism(int absenteeism) {
        this.absenteeism = absenteeism;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getAbsenteeismDate() {
        return absenteeismDate;
    }

    public void setAbsenteeismDate(String absenteeismDate) {
        this.absenteeismDate = absenteeismDate;
    }

    public String getLocalMap() {
        return localMap;
    }

    public void setLocalMap(String localMap) {
        this.localMap = localMap;
    }

    public String getYearDay() {
        return yearDay;
    }

    public void setYearDay(String yearDay) {
        this.yearDay = yearDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", six='" + six + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", cardId='" + cardId + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", exitDate='" + exitDate + '\'' +
                ", realm=" + realm +
                ", workDay=" + workDay +
                ", status=" + status +
                ", realDay=" + realDay +
                ", absenteeism=" + absenteeism +
                ", statusDate='" + statusDate + '\'' +
                ", absenteeismDate='" + absenteeismDate + '\'' +
                ", localMap='" + localMap + '\'' +
                ", yearDay='" + yearDay + '\'' +
                '}';
    }
}
