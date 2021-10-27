package com.atguigu.dao;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author shkstart
 * @create 2021-10-17 21:06
 */

public interface UserMapper extends Mapper<User> {


}
