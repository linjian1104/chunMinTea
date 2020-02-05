package com.liulei.service;


import com.liulei.entity.TeaSc;

import java.util.List;

public interface TeaScService {
    /**
     * 直接根据openID查询所有
     * */
    List<TeaSc> findByOpenId(String openId);

    /**
     * 根据openId以及sc_name来进行删除
     *
     * */
    int deleteByOpenId(String openId, String name);

    /**根据openId以及对象来进行添加
     *
     * */
    int insertByOpenId(TeaSc tea_sc);

}
