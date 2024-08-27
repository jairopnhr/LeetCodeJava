package com.example.solid.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends User {
    
    private List<SchoolSubject> subject;
    private Map<SchoolSubject ,List<Double>> grades;

    

    public Student()
    {
        this.grades = new HashMap<>();
        this.subject = new ArrayList<>();
        this.setRole(Role.USER);
    }


    public Student(long long1, String string, String string2, String string3) {
        //TODO Auto-generated constructor stub
    }


    public List<SchoolSubject> getSubject() {
        return subject;
    }


    public void setSubject(List<SchoolSubject> subject) {
        this.subject = subject;
    }


    public Map<SchoolSubject, List<Double>> getGrades() {
        return grades;
    }


    public void setGrades(Map<SchoolSubject, List<Double>> grades) {
        this.grades = grades;
    }



}
