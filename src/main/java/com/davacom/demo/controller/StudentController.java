package com.davacom.demo.controller;

import com.davacom.demo.dto.request.StudentDto;
import com.davacom.demo.dto.response.StudentDTOResponse;
import com.davacom.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;


    @PostMapping("/register")
    public StudentDTOResponse registerNewStudent(@RequestBody StudentDto studentDto) {
        return studentService.registerStudent(studentDto);
    }


}
