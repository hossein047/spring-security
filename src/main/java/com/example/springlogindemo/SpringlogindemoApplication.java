package com.example.springlogindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
@EntityScan("<package with entities>")
@SpringBootApplication
public class SpringlogindemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringlogindemoApplication.class, args);
    }

}
