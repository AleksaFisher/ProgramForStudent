package com.gd.student.model;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class Student {
    String firstname;
    String lastname;
    Program program;
    LocalDateTime startDate;

    public String getFirstname(){
        return String.valueOf(this.firstname);
    }
    public String getLastname(){
        return String.valueOf(this.lastname);
    }

}


