package com.example.scb.Trainning.dto.response;

import com.example.scb.Trainning.dto.StudentInfoDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DataDtoResponse {
    List<StudentInfoDto> data;
}
