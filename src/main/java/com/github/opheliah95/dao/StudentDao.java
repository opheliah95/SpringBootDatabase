package com.github.opheliah95.dao;

import com.github.opheliah95.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentDao {

    int insertStudent(UUID id, Student student);

    default int insertStudent(Student student){
        UUID id = UUID.randomUUID();
        return insertStudent(id, student);
    }

    // template for retrival
    List<Student> selectAllStudent();

    // template for update a student
    int updateStudent(UUID id , Student student);

    // template for delete student
    int deleteStudent(UUID id);

    // optional method that selects person by id
    Optional<Student> selectStudentById(UUID id);

}
