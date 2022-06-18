package com.yllu.saltedge;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class SaltEdgeClientAPIApplication implements CommandLineRunner {


    @Value("${spring.datasource.url}")
    String jdbcURL;

    public static void main(String[] args) {
        SpringApplication.run(SaltEdgeClientAPIApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(jdbcURL);
    }
}
