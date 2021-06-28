package com.stopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description mybatisplus
 * @Author stopping
 * @date: 2021/6/28 22:45
 */
@SpringBootApplication
@MapperScan("com.stopping.mapper")
public class MybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class,args);
    }
}
