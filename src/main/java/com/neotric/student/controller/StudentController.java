package com.neotric.student.controller;

import com.neotric.student.model.StudentEntity;
import com.neotric.student.service.SchoolService;
import com.neotric.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping(value ="/getStudents")
    public List<StudentEntity> getstudents(){
        return studentService.getStudent();
    }
    @GetMapping(value = "/getTeachercount")
    public int getTeachercount(){
        SchoolService ss=new SchoolService();
        return ss.getTeachercount();
    }
    @GetMapping(value = "/getadd")
    public int getadd(){
        SchoolService ss=new SchoolService();
        return ss.getadd();
    }
    @GetMapping(value = "/getremove")
    public int getremove(){
        SchoolService ss=new SchoolService();
        return ss.getremove();
}

}
