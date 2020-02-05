package com.liulei.dao;

import com.liulei.entity.TeaPj;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (TeaPj)表数据库访问层
 *
 * @author makejava
 * @since 2019-12-03 15:56:47
 */
@Repository
@Mapper
public interface TeaPjDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pjId 主键
     * @return 实例对象
     */
    @Select("select * from teapj where pj_id = #{0}")
    TeaPj queryById(Integer pjId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TeaPj> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 直接查询所有数据
     * */
    @Select("select * from teaPj")
    List<TeaPj> findAll();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param teaPj 实例对象
     * @return 对象列表
     */
    List<TeaPj> queryAll(TeaPj teaPj);

    /**
     * 新增数据
     *
     * @param teaPj 实例对象
     * @return 影响行数
     */
    int insert(TeaPj teaPj);

    /**
     * 修改数据
     *
     * @param teaPj 实例对象
     * @return 影响行数
     */
    int update(TeaPj teaPj);

    /**
     * 通过主键删除数据
     *
     * @param pjId 主键
     * @return 影响行数
     */
    int deleteById(Integer pjId);

}