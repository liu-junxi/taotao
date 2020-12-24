package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
 *  @创建时间:  2020/12/22 10:20
 *  @描述：    TODO
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ComsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(ComsumerApp.class ,args);
    }
}
