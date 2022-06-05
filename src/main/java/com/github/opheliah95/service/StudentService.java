package com.github.opheliah95.service;

import com.github.opheliah95.dao.StudentDao;
import com.github.opheliah95.model.Student;

public class StudentService {
    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao){
        this.studentDao = studentDao;
    }
    public int addStudent(Student student){
        return studentDao.insertStudent(student);
    }
}
