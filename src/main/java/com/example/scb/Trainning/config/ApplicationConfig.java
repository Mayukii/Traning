package com.example.scb.Trainning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@Configuration
public class ApplicationConfig {

    @Bean(name = "normalRestTemplate")
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Primary
    @Bean(name = "loadBalancedRestTemplate")
    public RestTemplate getLoadBalanceRestTemplate() {
        RestTemplate restTemplate = new RestTemplate(new HttpComponentsClientHttpRequestFactory());
        restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        return restTemplate;
    }
}
