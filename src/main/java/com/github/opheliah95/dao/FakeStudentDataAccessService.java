package com.github.opheliah95.dao;

import com.github.opheliah95.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    @Override
    public List<Student> selectAllStudent() {
        return DB;
    }

    @Override
    public int updateStudent(UUID id, Student student) {
        return selectStudentById(id)
                .map(
                p ->{
                    int indexToDelete = DB.indexOf(student);
                    if(indexToDelete >=0) {
                        DB.set(indexToDelete, student);
                        return 1;
                    }
                    return 0;

                })
                .orElse(0);

    }

    @Override
    public int deleteStudent(UUID id) {
        Optional<Student> result = selectStudentById(id);
        if (result.isEmpty()){
            return 0;
        }
        DB.remove(result);
        return 1;
    }

    @Override
    public Optional<Student> selectStudentById(UUID id) {
        return DB.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst();
    }
}
