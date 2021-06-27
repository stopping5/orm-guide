package com.stopping.mapper;

import com.stopping.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class UserMapperTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //通过调用sqlSession封装的方法获取
        User user = new User();
        user.setName("job").setUsername("job").setEmail("1123@cc.com").setPassword("123456");
        userMapper.insertUser(user);
        List<User> users = userMapper.selectUser();
        for (User u : users) {
            System.out.println("获取姓名:"+u.getName());
        }
    }
}