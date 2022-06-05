package com.github.opheliah95.api;

import com.github.opheliah95.model.Student;
import com.github.opheliah95.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    @DeleteMapping(path="/{id}")
    public int deleteStudent(@PathVariable("id") UUID id){
        return studentService.deleteStudent(id);
    }

    @PutMapping(path="/{id}")
    public int updateStudent(@PathVariable("id") UUID id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }

    // select by id
    @GetMapping(path="/{id}")
    public Student selectStudentById(@PathVariable("id") UUID id){
        return studentService.selectStudentById(id)
                .orElse(null);

    }

}
