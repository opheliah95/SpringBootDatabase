package com.github.opheliah95.api;

import com.github.opheliah95.model.Student;
import com.github.opheliah95.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// this is the api have get post delete put
@RequestMapping("api/v1/student")
@RestController
public class StudentController {
    private final StudentService studentService;

    @Autowired //inject dependency
    public StudentController(StudentService service){
        this.studentService = service;
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> selectAllStudents(){
        return studentService.selectAllStudent();
    }

}
