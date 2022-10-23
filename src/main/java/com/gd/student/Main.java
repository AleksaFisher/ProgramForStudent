package com.gd.student;


import com.gd.student.model.Student;

import java.util.Date;
import java.util.Scanner;

public class Main {

   // public static main(String[] args){
        public String chooseReport() {
        System.out.print("If you want to run a short report, press 0");
        System.out.print("If you want to run a full report, press 1");
        Scanner scReport = new Scanner(System.in);
        String chooseReport = scReport.next();
        return chooseReport;
    }


}