package com.gd.student;


import com.gd.student.model.Student;
import com.gd.student.service.calculate.DateCalculator;
import com.gd.student.service.report.FullReport;
import com.gd.student.service.report.Report;
import com.gd.student.service.report.ReportType;
import com.gd.student.service.report.ShortReport;
import lombok.Getter;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
@Getter

public class Main {

    public static void main(String[] args) throws ParseException {
     //   Report Short;
        System.out.print("If you want to run a short report, press 0");
        System.out.print("If you want to run a full report, press 1");
        Scanner scReport = new Scanner(System.in);
        String chooseReport = scReport.nextLine();
        Report report = Report.create(ReportType.fromString(chooseReport));
        String b;
        b = report.getReportType();





    }



}