package com.example.solid.dao;

import java.util.List;

import com.example.solid.model.SchoolSubject;
import com.example.solid.model.Student;

public interface StudentsDao<S extends SchoolSubject> extends UserDao<Student> {
    
    void saveStudentsInSchoolSubject( Student Student , S subject );

    void saveGradeStudents(List<Double>grade, S subject );

}   
