package com.example.scb.Trainning.service;

import com.example.scb.Trainning.component.StudentComponent;
import com.example.scb.Trainning.dto.StudentInfoDto;
import com.example.scb.Trainning.dto.StudentRequest;
import com.example.scb.Trainning.dto.response.DataDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainningServicelmpi implements TrainningService {

    @Autowired
    private StudentComponent studentComponent;

    public String getName(String name) {
        return "Hello " + name;
    }

    public List<StudentInfoDto> getStudent() {
        DataDtoResponse dataDtoResponse = studentComponent.getStudent();
        List<StudentInfoDto> studentInfoDtoList = dataDtoResponse.getData();
        return studentInfoDtoList;
    }


    public List<StudentInfoDto> getStudentName(StudentRequest request) {
        DataDtoResponse dataDtoResponse = studentComponent.getStudent();
        List<StudentInfoDto> studentInfoDtoList = dataDtoResponse.getData();
        String name = request.getName();

        List<StudentInfoDto> result = new ArrayList<>();
        if (studentInfoDtoList.isEmpty()){
            return result;
        }
        for (StudentInfoDto studentInfoDto : studentInfoDtoList) {
            if (name.equalsIgnoreCase(studentInfoDto.getName())) {
                result.add(studentInfoDto);
            }
        }
        return result;
    }

}
