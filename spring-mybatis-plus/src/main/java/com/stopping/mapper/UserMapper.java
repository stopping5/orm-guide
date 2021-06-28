package com.stopping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stopping.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description UserMapper
 * @Author stopping
 * @date: 2021/6/27 19:08
 */
public interface UserMapper extends BaseMapper<User> {

}
