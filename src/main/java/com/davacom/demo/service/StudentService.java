package com.davacom.demo.service;

import com.davacom.demo.dto.request.StudentDto;
import com.davacom.demo.dto.response.StudentDTOResponse;
import com.davacom.demo.model.Student;

public interface StudentService {

    StudentDTOResponse registerStudent(StudentDto studentDto);
}
