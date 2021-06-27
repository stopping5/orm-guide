package com.stopping.springmybatis.mapper;

import com.stopping.springmybatis.SpringMybatisApplication;
import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = SpringMybatisApplication.class)
class UserMapperTest {

    @Resource
    UserMapper userMapper;

    @Test
    void selectUser() {
        userMapper.selectUser().stream().forEach(user -> {
            System.out.println(user.getUsername());
        });
    }
}