package com.stopping.model;

import com.sun.net.httpserver.Filter;
import lombok.Builder;
import lombok.Data;
import lombok.With;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.lang.annotation.Retention;

/**
 * @Description User
 * @Author stopping
 * @date: 2021/6/27 19:05
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {
    /**
     * id
     * */
    private Integer id;
    /**
     * 头像
     * */
    private String avatar;
    /**
     * 邮箱
     * */
    private String email;
    /**
     * 账号
     * */
    private String name;
    /**
     * 密码
     * */
    private String password;
    /**
     * 用户名
     * */
    private String username;
}
