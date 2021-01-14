package com.example.scb.Trainning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ApplicationConfig {

    @Bean(name = "normalRestTemplate")
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Primary
    @Bean(name = "loadBalancedRestTemplate")
    public RestTemplate getLoadBalanceRestTemplate() {
        return new RestTemplate();
    }
}
