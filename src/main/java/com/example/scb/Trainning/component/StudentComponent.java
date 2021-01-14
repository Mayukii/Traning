package com.example.scb.Trainning.component;

import com.example.scb.Trainning.dto.response.DataDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StudentComponent {

    @Autowired
    @Qualifier("normalRestTemplate")
    private RestTemplate normalRestTemplate;

    @Value("${student.url}")
    private String studentUrl;

    public DataDtoResponse getStudent() {
        HttpHeaders httpHeaders = new HttpHeaders();

        ResponseEntity<DataDtoResponse> responseEntity = normalRestTemplate.exchange(studentUrl,
                HttpMethod.GET,
                new HttpEntity<>(httpHeaders),
                DataDtoResponse.class);
        return responseEntity.getBody();
    }
}
