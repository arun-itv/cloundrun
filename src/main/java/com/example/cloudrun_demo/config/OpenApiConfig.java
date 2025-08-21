package com.example.cloudrun_demo.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Cloud Run Demo API")
                        .version("1.0")
                        .description("Demo API with Swagger and Actuator using Spring Boot 3.4.7"));
    }
}
