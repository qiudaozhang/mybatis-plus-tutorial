package com.qiudaozhang.mybatisplustutorial;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qiudaozhang.mybatisplustutorial.mapper")
public class MybatisPlusTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusTutorialApplication.class, args);
    }

}
