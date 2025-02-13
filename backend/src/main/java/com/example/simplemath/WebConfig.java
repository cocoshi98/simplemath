package com.example.simplemath;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Allow CORS for /api endpoints
                .allowedOrigins("http://localhost:3000") // Frontend React URL
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow these methods
                .allowCredentials(true); // Allow credentials
    }
}
