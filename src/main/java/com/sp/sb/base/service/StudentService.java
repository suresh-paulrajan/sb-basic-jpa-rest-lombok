package com.sp.sb.base.service;

import com.sp.sb.base.entity.Student;
import com.sp.sb.base.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getStudentsList(){
        return repository.findAll();
    }
}
