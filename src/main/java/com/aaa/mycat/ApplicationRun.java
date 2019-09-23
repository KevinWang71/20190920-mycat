package com.aaa.mycat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ApplicationRun
 * @Author wang
 * @Date 2019/9/20 20:11
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.aaa.mycat.mapper")
public class ApplicationRun {
    public static void main(String[] args){
        SpringApplication.run(ApplicationRun.class, args);
    }
}
