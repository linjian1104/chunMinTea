package com.liulei.service;


import com.liulei.entity.Allcontent;

import java.util.List;

/**
 * (Allcontent)表服务接口
 *
 * @author makejava
 * @since 2019-11-29 10:13:56
 */
public interface AllcontentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Allcontent queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Allcontent> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param allcontent 实例对象
     * @return 实例对象
     */
    Allcontent insert(Allcontent allcontent);

    /**
     * 直接查询所有数据
     * */
    List<Allcontent> findAll();

    /**
     * 通过关键字进行查询
     *
     * */
    List<Allcontent> findAllByKeyWords(String words);

    /**
     * 修改数据
     *
     * @param allcontent 实例对象
     * @return 实例对象
     */
    Allcontent update(Allcontent allcontent);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 根据名字查询其数量
     * */
    int selectCountByName(String name);

}