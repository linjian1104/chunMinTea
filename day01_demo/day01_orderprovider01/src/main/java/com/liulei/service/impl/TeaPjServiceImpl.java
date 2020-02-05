package com.liulei.service.impl;

import com.liulei.dao.TeaPjDao;
import com.liulei.entity.TeaPj;
import com.liulei.service.TeaPjService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TeaPj)表服务实现类
 *
 * @author makejava
 * @since 2019-12-03 15:56:47
 */
@Service("teaPjService")
public class TeaPjServiceImpl implements TeaPjService {
    @Resource
    private TeaPjDao teaPjDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pjId 主键
     * @return 实例对象
     */
    @Override
    public TeaPj queryById(Integer pjId) {
        return this.teaPjDao.queryById(pjId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TeaPj> queryAllByLimit(int offset, int limit) {
        return this.teaPjDao.queryAllByLimit(offset, limit);
    }

    /**
     * 直接查询所有的评价信息
     *
     * */
    @Override
    public List<TeaPj> findAll() {
        try {
            List<TeaPj> all = teaPjDao.findAll();
            return all;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 新增数据
     *
     * @param teaPj 实例对象
     * @return 实例对象
     */
    @Override
    public TeaPj insert(TeaPj teaPj) {
        this.teaPjDao.insert(teaPj);
        return teaPj;
    }

    /**
     * 修改数据
     *
     * @param teaPj 实例对象
     * @return 实例对象
     */
    @Override
    public TeaPj update(TeaPj teaPj) {
        this.teaPjDao.update(teaPj);
        return this.queryById(teaPj.getPjId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pjId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pjId) {
        return this.teaPjDao.deleteById(pjId) > 0;
    }
}