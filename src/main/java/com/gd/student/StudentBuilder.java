package com.gd.student;

import com.gd.student.model.Program;
import com.gd.student.model.Student;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class StudentBuilder {
    public static void main(String[] args) {
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
}

}
