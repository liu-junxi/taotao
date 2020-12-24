package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*
 *  @创建时间:  2020/12/22 9:48
 *  @描述：    TODO
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp. class ,args);
    }
}
