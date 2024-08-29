package org.lai.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.lai.mybatis.mapper")
public class MybatisPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPracticeApplication.class, args);
    }

}
