package com.scaler.productservice.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {
    @Bean
    public RestTemplate createRestBean(){
        return new RestTemplate();
    }
}
