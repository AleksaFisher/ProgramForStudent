package com.gd.student;

import com.gd.student.model.Program;
import com.gd.student.model.Student;
import lombok.Getter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import com.gd.student.Main.*;
@Getter
public class StudentBuilder {
    public static void main(String[] args) throws ParseException {

    Student studentOne = Student.builder()
            .firstname("Ivan")
            .lastname("Ivanov")
            .program(Program.JAVA_DEV)
            .startDate(LocalDateTime.of(2020, 6, 1, 10, 0))
            .build();

    Student studentTwo = Student.builder()
            .firstname("Ivan")
            .lastname("Sidorov")
            .program(Program.AQE)
            .startDate(LocalDateTime.of(2020, 6, 1, 10, 0))
            .build();
    ProgrammAsigment asigment= new ProgrammAsigment();
    asigment.addAssigment(studentOne, Program.JAVA_DEV);
    asigment.addAssigment(studentTwo, Program.AQE);


        Report report = new Report(asigment);
        report.Print(studentOne);
        report.Print(studentTwo);
       // ReportFull reportFull = new ReportFull(asigment);
       // reportFull.PrintFull(studentOne);
       // reportFull.PrintFull(studentTwo);

}

}
