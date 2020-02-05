package com.liulei.controller;

import com.liulei.entity.Allcontent;
import com.liulei.service.AllcontentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Allcontent)表控制层
 * 商品展示的控制层
 * @author makejava
 * @since 2019-11-29 10:13:58
 */
@RestController
@RequestMapping("food")
public class AllcontentController {
    /**
     * 服务对象
     */
    @Resource
    private AllcontentService allcontentService;

    /**
     * 通过主键查询单条数据
     *
     * @param
     * @return 单条数据
     */
    @GetMapping("findAll")
    @ResponseBody
    public List<Allcontent> findAll() {
        return allcontentService.findAll();
    }

    @GetMapping("search/{name}")
    @ResponseBody
    public List<Allcontent> findAllByKeyWords(@PathVariable("name")String name){
        return allcontentService.findAllByKeyWords(name);
    }

    @GetMapping("selectCount/{name}")
    public int selectCountByName(@PathVariable("name")String name){
        return allcontentService.selectCountByName(name);
    }

}