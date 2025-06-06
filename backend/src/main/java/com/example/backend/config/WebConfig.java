package com.example.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // 所有 API 路徑
                        .allowedOrigins("http://localhost:3000") // 前端來源
                        .allowedMethods("*") // GET, POST, PUT, DELETE...
                        .allowedHeaders("*");
            }
        };
    }
}
