package com.liulei.dao;

import com.liulei.entity.Allcontent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Allcontent)表数据库访问层
 *
 * @author makejava
 * @since 2019-11-29 10:13:52
 */
@Repository
@Mapper
public interface AllcontentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Allcontent queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Allcontent> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param allcontent 实例对象
     * @return 对象列表
     */
    List<Allcontent> queryAll(Allcontent allcontent);

    /**
     * 直接查询所有数据
     * */
    @Select("select * from allcontent")
    List<Allcontent> findAll();

    /**
     * 通过关键字进行查询
     *
     * */
    @Select("select * from allcontent where " +
            "name like concat ('%',#{0},'%') " +
            "or content like concat ('%',#{0},'%') " +
            "or price like concat ('%',#{0},'%')")
    List<Allcontent> findAllByKeyWords(String words);

    /**
     * 新增数据
     *
     * @param allcontent 实例对象
     * @return 影响行数
     */
    int insert(Allcontent allcontent);

    /**
     * 修改数据
     *
     * @param allcontent 实例对象
     * @return 影响行数
     */
    int update(Allcontent allcontent);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    @Select("select count from allcontent where name = #{0}")
    int selectCountByName(String name);
}