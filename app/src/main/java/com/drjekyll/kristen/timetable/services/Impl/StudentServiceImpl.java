package com.drjekyll.kristen.timetable.services.Impl;

import com.drjekyll.kristen.timetable.model.Student;
import com.drjekyll.kristen.timetable.repositories.RestAPI;
import com.drjekyll.kristen.timetable.repositories.rest.RestStudentAPI;
import com.drjekyll.kristen.timetable.services.StudentService;

import java.util.List;

/**
 * Created by Kristen on 26/09/2015.
 */
public class StudentServiceImpl implements StudentService {
    final RestAPI<Student, Long> rest = new RestStudentAPI();

    @Override
    public Student findById(Long id){
        return rest.get(id);
    }

    @Override
    public String save(Student entity){
        return rest.post(entity);
    }

    @Override
    public String update(Student entity){
        return rest.put(entity);
    }

    @Override
    public String delete(Student entity){
        return rest.delete(entity);
    }

    @Override
    public List<Student> findAll(){
        return rest.getAll();
    }
}
