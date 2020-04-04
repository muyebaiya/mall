package com.csu.mall.dao;

import com.csu.mall.MallApplicationTests;
import com.csu.mall.pojo.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lihao on 2020/4/4.
 */

public class CategoryMapperTest extends MallApplicationTests {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void findById() throws Exception {
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }

    @Test
    public void queryById() throws Exception {
        Category category = categoryMapper.queryById(100001);
        System.out.println(category.toString());
    }

}