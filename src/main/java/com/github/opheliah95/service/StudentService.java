package com.github.opheliah95.service;

import com.github.opheliah95.dao.StudentDao;
import com.github.opheliah95.model.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao){
        this.studentDao = studentDao;
    }
    public int addStudent(Student student){
        return studentDao.insertStudent(student);
    }
}
