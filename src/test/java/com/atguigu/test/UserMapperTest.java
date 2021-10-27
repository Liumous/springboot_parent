package com.atguigu.test;

import com.atguigu.Application;
import com.atguigu.dao.UserMapper;
import com.atguigu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-10-17 21:12
 */
@RunWith(SpringRunner.class)//以spring方式运行，产生ioc容器
@SpringBootTest//spring boot与junit进行整合
public class UserMapperTest {

     @Resource
     UserMapper userMapper;

     @Test
     public void test1(){

         List<User> users = userMapper.selectAll();
         for (User user : users) {
             System.out.println(user);
         }

     }
}
