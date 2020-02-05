package com.liulei.entity;

import java.io.Serializable;

/**
 * (TeaPj)实体类
 *
 * @author makejava
 * @since 2019-12-03 15:56:47
 */
public class TeaPj implements Serializable {
    private static final long serialVersionUID = 927725651014939052L;

    public String getPj_name() {
        return pj_name;
    }

    public void setPj_name(String pj_name) {
        this.pj_name = pj_name;
    }

    private String pj_name;
    private Integer pj_id;
    
    private String pj_score;
    
    private String pj_content;
    
    private String pj_icon;
    
    private String pj_date;
    
    private String pj_anscontent;
    
    private String pj_ansdate;


    public Integer getPjId() {
        return pj_id;
    }

    public void setPjId(Integer pjId) {
        this.pj_id = pjId;
    }

    public Object getPjScore() {
        return pj_score;
    }

    public void setPjScore(String pjScore) {
        this.pj_score = pjScore;
    }

    public String getPjContent() {
        return pj_content;
    }

    public void setPjContent(String pjContent) {
        this.pj_content = pjContent;
    }

    public String getPjIcon() {
        return pj_icon;
    }

    public void setPjIcon(String pjIcon) {
        this.pj_icon = pjIcon;
    }

    public String getPjDate() {
        return pj_date;
    }

    public void setPjDate(String pjDate) {
        this.pj_date = pjDate;
    }

    public String getPjAnscontent() {
        return pj_anscontent;
    }

    public void setPjAnscontent(String pjAnscontent) {
        this.pj_anscontent = pjAnscontent;
    }

    public String getPjAnsdate() {
        return pj_ansdate;
    }

    public void setPjAnsdate(String pjAnsdate) {
        this.pj_ansdate = pjAnsdate;
    }

}