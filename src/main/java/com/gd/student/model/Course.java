package com.gd.student.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.xml.namespace.QName;
@RequiredArgsConstructor
@Getter
public enum Course {
    JAVA("Java", 16),
    JDBC("JDBC", 24),
    SPRING ("Spring", 16),
    TESTDESIGN ("TestDesign", 10),
    PAGEOBJECT("PageObject", 16),
    SELENIUM("Selenium", 16);


    private final String name;
    private final int duration;

}
