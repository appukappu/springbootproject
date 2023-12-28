package com.neotric.student.service;

import com.neotric.student.Repository.StudentRepository;
import com.neotric.student.model.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<StudentEntity> getStudent(){
        return studentRepository.findAll();
    }
}
