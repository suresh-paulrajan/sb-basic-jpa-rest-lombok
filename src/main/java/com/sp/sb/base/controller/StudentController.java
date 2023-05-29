package com.sp.sb.base.controller;

import com.sp.sb.base.entity.Student;
import com.sp.sb.base.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/student")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getStudents(){
        return service.getStudentsList();
    }

}
