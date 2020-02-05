package com.liulei.service;


import com.liulei.entity.TeaPj;

import java.util.List;

/**
 * (TeaPj)表服务接口
 *
 * @author makejava
 * @since 2019-12-03 15:56:47
 */
public interface TeaPjService {

    /**
     * 通过ID查询单条数据
     *
     * @param pjId 主键
     * @return 实例对象
     */
    TeaPj queryById(Integer pjId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TeaPj> queryAllByLimit(int offset, int limit);

    /**
     * 直接查询所有数据
     * */
    List<TeaPj> findAll();


    /**
     * 新增数据
     *
     * @param teaPj 实例对象
     * @return 实例对象
     */
    TeaPj insert(TeaPj teaPj);

    /**
     * 修改数据
     *
     * @param teaPj 实例对象
     * @return 实例对象
     */
    TeaPj update(TeaPj teaPj);

    /**
     * 通过主键删除数据
     *
     * @param pjId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pjId);

}