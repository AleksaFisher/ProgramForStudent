package com.gd.student;

import com.gd.student.model.Program;
import com.gd.student.model.Student;

import java.io.PrintStream;
import java.util.Arrays;

public class Report {


    public static void main(String[] args)  {
    System.out.println("Generating report date"  );

    System.out.println(Student.builder().build().getFirstname() + Student.builder().build().getLastname() + Arrays.stream(Program.values()).map(Program::getCourses));

    }

}
