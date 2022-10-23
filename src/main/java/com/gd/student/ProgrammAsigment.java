package com.gd.student;

import com.gd.student.model.Program;
import com.gd.student.model.Student;

import java.util.HashMap;
import java.util.Map;

public class ProgrammAsigment {
    Map<Student, Program> assigment = new HashMap<>();

    public void addAssigment(Student student, Program program){
        assigment.put(student, program);

    }
    public Program getAssigment(Student student){
     return assigment.get(student);
    }
}
