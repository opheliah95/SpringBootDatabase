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

    @DeleteMapping
    public int deleteStudent(UUID id){
        return studentService.deleteStudent(id);
    }

    @PutMapping
    public int updateStudent(UUID id, Student student){
        return studentService.updateStudent(id, student);
    }

    // select by id
    @GetMapping(path="/{id}")
    public Student selectStudentById(@PathVariable("id") UUID id){
        return studentService.selectStudentById(id)
                .orElse(null);

    }

}
