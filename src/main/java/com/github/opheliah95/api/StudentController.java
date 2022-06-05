package com.github.opheliah95.api;

import com.github.opheliah95.model.Student;
import com.github.opheliah95.service.StudentService;

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService service){
        this.studentService = service;
    }

    public void addStudent(Student student){
        studentService.addStudent(student);
    }

}
