package com.github.opheliah95.service;

import com.github.opheliah95.dao.StudentDao;
import com.github.opheliah95.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

    public List<Student> selectAllStudent(){
        return studentDao.selectAllStudent();
    }

    public int deleteStudent(UUID id){
        return studentDao.deleteStudent(id);
    }

    public int updateStudent(UUID id, Student student){
        return studentDao.updateStudent(id, student);
    }

    public Optional<Student>selectStudentById(UUID id){
        return studentDao.selectStudentById(id);
    }

}
