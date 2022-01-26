package com.sp.sb.base.repository;

import com.sp.sb.base.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository repository;

    @Test
    void getAllStudents(){
        List<Student> studentList = repository.findAll();
        System.out.println("studentList = " + studentList);
    }

    @Test
    void createStudent(){
        Student student = Student
                .builder()
                .firstName("Suresh")
                .lastName("Paulrajan")
                .email("suresh@email.com")
                .dob(LocalDate.of(1992, Month.JUNE, 8))
                .build();

        repository.save(student);
    }
}