package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author shkstart
 * @create 2021-10-17 20:53
 */
@SpringBootApplication
@EnableTransactionManagement//声明式事务
@MapperScan(basePackages = "com.atguigu.dao")//mapper框架单独扫描dao包
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
