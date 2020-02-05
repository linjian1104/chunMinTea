package com.liulei.service.impl;


import com.liulei.dao.AllcontentDao;
import com.liulei.entity.Allcontent;
import com.liulei.service.AllcontentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Allcontent)表服务实现类
 *
 * @author makejava
 * @since 2019-11-29 10:13:57
 */
@Service("allcontentService")
public class AllcontentServiceImpl implements AllcontentService {
    @Resource
    private AllcontentDao allcontentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Allcontent queryById(Integer id) {
        return this.allcontentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Allcontent> queryAllByLimit(int offset, int limit) {
        return this.allcontentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param allcontent 实例对象
     * @return 实例对象
     */
    @Override
    public Allcontent insert(Allcontent allcontent) {
        this.allcontentDao.insert(allcontent);
        return allcontent;
    }

    /**
     * 直接查询所有数据
     * */
    @Override
    public List<Allcontent> findAll() {
        return this.allcontentDao.findAll();
    }

    /**
    * 通过关键字查询
    *
    * */
    @Override
    public List<Allcontent> findAllByKeyWords(String words) {
        return this.allcontentDao.findAllByKeyWords(words);
    }

    /**
     * 修改数据
     *
     * @param allcontent 实例对象
     * @return 实例对象
     */
    @Override
    public Allcontent update(Allcontent allcontent) {
        this.allcontentDao.update(allcontent);
        return this.queryById(allcontent.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.allcontentDao.deleteById(id) > 0;
    }

    /**int
     * 根据商品名查询其数量
     * */
    @Override
    public int selectCountByName(String name) {
        return this.allcontentDao.selectCountByName(name);
    }
}