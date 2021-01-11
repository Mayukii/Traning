package com.example.scb.Trainning.component;

import com.example.scb.Trainning.dto.response.DataDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    private final String STUDENT_URL = "https://trainning-scb.free.beeceptor.com/api/student";

    public DataDtoResponse getStudent() {
        HttpHeaders httpHeaders = new HttpHeaders();

        ResponseEntity<DataDtoResponse> responseEntity = normalRestTemplate.exchange(STUDENT_URL,
                HttpMethod.GET,
                new HttpEntity<>(httpHeaders),
                DataDtoResponse.class);
        return responseEntity.getBody();
    }
}
