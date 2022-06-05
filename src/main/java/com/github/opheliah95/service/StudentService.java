package com.github.opheliah95.service;

import com.github.opheliah95.dao.StudentDao;
import com.github.opheliah95.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentDao studentDao;
    @Autowired
    public StudentService(@Qualifier("fakeDao") StudentDao studentDao){
        this.studentDao = studentDao;
    }
    public int addStudent(Student student){
        return studentDao.insertStudent(student);
    }
}
