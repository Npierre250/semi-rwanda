package com.example.bibafrica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BibafricaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibafricaApplication.class, args);
    }

}
