package com.davacom.demo.service.serviceImpl;

import com.davacom.demo.dto.request.StudentDto;
import com.davacom.demo.dto.response.StudentDTOResponse;
import com.davacom.demo.exception.RecordNotComplete;
import com.davacom.demo.model.Student;
import com.davacom.demo.repository.StudentRepository;
import com.davacom.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDTOResponse registerStudent(StudentDto studentDto) {
        if(studentDto.getName()==null) {
            throw new RecordNotComplete("Student name must be provided");
        }
        if(studentDto.getAge()<=0) {
            throw new RecordNotComplete("Provide valid age");
        }

        Student student = Student.builder()
                .age(studentDto.getAge())
                .name(studentDto.getName())
                .build();
//
//        Student student = new Student();
//        BeanUtils.copyProperties(studentDto, student);

    Student savedStudent = studentRepository.save(student);

        return StudentDTOResponse.builder()
                .age(savedStudent.getAge())
                .createdAt(savedStudent.getCreatedAt())
                .id(savedStudent.getId())
                .updatedAt(savedStudent.getUpdatedAt())
                .name(savedStudent.getName())
                .build();
    }


}
