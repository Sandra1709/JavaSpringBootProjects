package com.ust.bootsecuritynew.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig  implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200") // Allow your Angular app's origin
                .allowedMethods("GET", "POST") // Specify allowed methods
                .allowedHeaders("authenticate", "Content-Type"); // Specify allowed headers
    }
}


