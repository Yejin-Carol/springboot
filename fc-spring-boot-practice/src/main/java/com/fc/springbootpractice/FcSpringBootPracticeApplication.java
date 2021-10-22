package com.fc.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication(
    //    exclude = WebMvcAutoConfiguration.class
    //    excludeName = "WebMvcAutoConfiguration"
)
public class FcSpringBootPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FcSpringBootPracticeApplication.class, args);
    }

}
