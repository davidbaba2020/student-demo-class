package com.davacom.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_tbl")
public class Student extends BaseClass{
    private String name;
    private int age;
    @OneToMany
    private List<Subject> coursesToTake;
    @OneToMany
    private List<Teacher> teachersForMyCourse;
}
