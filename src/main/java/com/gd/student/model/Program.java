package com.gd.student.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

import static com.gd.student.model.Course.*;
@RequiredArgsConstructor
@Getter

public enum Program {
    JAVA_DEV("Java Developer", List.of(JAVA, JDBC, SPRING)),
    AQE ("Automation QE", List.of(TESTDESIGN, PAGEOBJECT, SELENIUM) );
    public final String name;
    public final List <Course> courses;

    public static int getDuration(){
        return courses.stream().mapToInt(Course::getDuration).sum();
    }
}
