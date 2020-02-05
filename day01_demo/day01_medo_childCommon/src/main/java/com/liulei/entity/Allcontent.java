package com.liulei.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@author: liulei
 *@date: 2019/12/8 0008 下午 8:35
 *@describe:
 * AllArgsConstructor 表示生成带有所有属性的构造方法
 * NoArgsConstructor 表示生成不带参数的构造方法
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Allcontent {
    private static final long serialVersionUID = 140084034320751686L;

    private Integer id;

    private String image;

    private String name;

    private String content;

    private Integer price;

    private Integer num;

    private String type;

    private Integer count;

    private String status;

    private String lunbo;

    private String demo2;

    private Integer demo3;

    private Integer demo4;

    private String demo5;

    @Override
    public String toString() {
        return "Allcontent{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", type='" + type + '\'' +
                ", count=" + count +
                ", status='" + status + '\'' +
                ", lunbo='" + lunbo + '\'' +
                ", demo2='" + demo2 + '\'' +
                ", demo3=" + demo3 +
                ", demo4=" + demo4 +
                ", demo5='" + demo5 + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLunbo() {
        return lunbo;
    }

    public void setLunbo(String lunbo) {
        this.lunbo = lunbo;
    }

    public String getDemo2() {
        return demo2;
    }

    public void setDemo2(String demo2) {
        this.demo2 = demo2;
    }

    public Integer getDemo3() {
        return demo3;
    }

    public void setDemo3(Integer demo3) {
        this.demo3 = demo3;
    }

    public Integer getDemo4() {
        return demo4;
    }

    public void setDemo4(Integer demo4) {
        this.demo4 = demo4;
    }

    public String getDemo5() {
        return demo5;
    }

    public void setDemo5(String demo5) {
        this.demo5 = demo5;
    }
}
