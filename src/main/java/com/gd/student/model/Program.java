package com.gd.student.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.gd.student.model.Course.*;
@RequiredArgsConstructor
@Getter

public enum Program {
    JAVA_DEV("Java Developer", List.of(JAVA, JDBC, SPRING)),
    AQE ("Automation QE", List.of(TESTDESIGN, PAGEOBJECT, SELENIUM) );
    private final String name;
    private final List <Course> courses;

    public int getDuration(){
        return courses.stream().mapToInt(Course::getDuration).sum();
    }
}
