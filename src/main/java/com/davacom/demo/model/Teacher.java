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
@Table(name = "teacher_tbl")
public class Teacher extends BaseClass{
    private String name;
    @OneToMany
    private List<Subject> coursesTaking;
}
