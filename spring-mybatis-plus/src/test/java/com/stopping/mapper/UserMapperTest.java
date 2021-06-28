package com.stopping.mapper;

import com.stopping.MybatisPlusApplication;
import com.stopping.model.domain.Category;
import com.stopping.service.category.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = MybatisPlusApplication.class)
class UserMapperTest {
    @Resource
    private UserMapper userMapper;
    @Resource
    private CategoryService categoryService;
    @Test
    public void selectUser(){
        //userMapper.selectList(null).stream().forEach(System.out::println);

        categoryService.lambdaQuery().list().forEach(System.out::println);
    }
}