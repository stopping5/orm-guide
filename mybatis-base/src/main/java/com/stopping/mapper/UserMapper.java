package com.stopping.mapper;

import com.stopping.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description UserMapper
 * @Author stopping
 * @date: 2021/6/27 19:08
 */
@Mapper
public interface UserMapper {
    /**
     * 查询用户信息
     * */
    List<User> selectUser();

    /**
     *  新增用户
     * */
    void insertUser(@Param("user")User user);
}
