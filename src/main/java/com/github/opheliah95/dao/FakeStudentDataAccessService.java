package com.github.opheliah95.dao;

import com.github.opheliah95.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao") // served as repo
public class FakeStudentDataAccessService implements StudentDao {
    // a fake database
    private static List<Student> DB = new ArrayList<>();

    @Override
    public int insertStudent(UUID id, Student student) {
        DB.add(new Student(id, student.getName()));
        return 1;
    }
}
