package com.liulei.service.impl;


import com.liulei.dao.TeaScDao;
import com.liulei.entity.TeaSc;
import com.liulei.service.TeaScService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: liulei
 * @date: 2019/12/4 13:33
 * @describe:
 */
@Service
public class TeaScServiceImpl implements TeaScService {
    @Autowired
    private TeaScDao teaScDao;

    @Override
    public List<TeaSc> findByOpenId(String openId) {
        return teaScDao.findByOpenId(openId);
    }

    @Override
    public int deleteByOpenId(String openId, String name) {
        return teaScDao.deleteByOpenId(openId,name);
    }

    @Override
    public int insertByOpenId(TeaSc tea_sc) {
        return teaScDao.insertByOpenId(tea_sc);
    }
}
