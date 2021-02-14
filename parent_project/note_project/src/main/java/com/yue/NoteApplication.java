package com.yue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author pengmin
 * @date 2021/1/31 14:35
 */

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = {"com.yue.dao"})
public class NoteApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoteApplication.class,args);
    }
}
