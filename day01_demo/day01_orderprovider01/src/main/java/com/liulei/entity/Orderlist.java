package com.liulei.entity;

import java.io.Serializable;

/**
 * (Orderlist)实体类
 *
 * @author makejava
 * @since 2019-12-11 13:42:29
 */
public class Orderlist implements Serializable {
    private static final long serialVersionUID = -48919634520121798L;
    
    private Integer orderid;
    
    private String openid;

    
    private Object orderinfo;
    
    private Object orderprice;
    
    private String orderdate;
    
    private String orderstatus;
    
    private Object custormprice;
    
    private Integer ordercount;
    
    private String ordernumber;
    
    private String housenumber;


    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }


    public Object getOrderinfo() {
        return orderinfo;
    }

    public void setOrderinfo(Object orderinfo) {
        this.orderinfo = orderinfo;
    }

    public Object getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(Object orderprice) {
        this.orderprice = orderprice;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Object getCustormprice() {
        return custormprice;
    }

    public void setCustormprice(Object custormprice) {
        this.custormprice = custormprice;
    }

    public Integer getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(Integer ordercount) {
        this.ordercount = ordercount;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    @Override
    public String toString() {
        return "Orderlist{" +
                "orderid=" + orderid +
                ", openid='" + openid + '\'' +
                ", orderinfo=" + orderinfo +
                ", orderprice=" + orderprice +
                ", orderdate='" + orderdate + '\'' +
                ", orderstatus='" + orderstatus + '\'' +
                ", custormprice=" + custormprice +
                ", ordercount=" + ordercount +
                ", ordernumber='" + ordernumber + '\'' +
                ", housenumber='" + housenumber + '\'' +
                '}';
    }
}