package com.gmail.maksimus40a.test.stand;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestStandApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(TestStandApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}