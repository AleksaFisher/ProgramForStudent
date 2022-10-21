package com.gd.student.model;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class Student {
    String firstname;
    String lastname;
    LocalDateTime startDate;
    Program program;

    public LocalDateTime getstartDate() {

        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getFirstname(){
        return String.valueOf(this.firstname);
    }
    public String getLastname(){
        return String.valueOf(this.lastname);
    }
    public Program getProgram() {
        return this.program;
    }
}


