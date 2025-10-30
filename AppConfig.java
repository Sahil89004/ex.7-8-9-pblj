package com.example.springdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Spring Framework Fundamentals");
    }

    @Bean
    public Student student() {
        return new Student(course());
    }
}
