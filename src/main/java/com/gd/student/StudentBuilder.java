package com.gd.student;

import com.gd.student.model.Program;
import com.gd.student.model.Student;
import lombok.Getter;

import java.text.ParseException;
import java.time.LocalDateTime;
@Getter
public class StudentBuilder {
    public static void main(String[] args) throws ParseException {

    Student studentOne = Student.builder()
            .firstname("Ivan")
            .lastname("Ivanov")
            .build();

    Student studentTwo = Student.builder()
            .firstname("Ivan")
            .lastname("Sidorov")
            .build();
    ProgrammAsigment asigment= new ProgrammAsigment();
    asigment.addAssigment(studentOne, Program.JAVA_DEV);
    asigment.addAssigment(studentTwo, Program.AQE);

        Report report = new Report(asigment);
        report.Print(studentOne);
}

}
