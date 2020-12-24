package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

/*
 *  @创建时间:  2020/12/23 9:09
 *  @描述：    TODO
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.itheima.mapper")
public class ManagerServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(ManagerServiceApp.class ,args);
    }
}
