package com.gd.student.service.reader;

import com.gd.student.service.report.Report;
import com.gd.student.service.report.ReportType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Reader extends Date {
    private Scanner sc;
    public Reader (){
        sc = new Scanner(System.in);
    }
    public Date readDate() throws ParseException {

        System.out.print("Enter day: ");
        String dateInString = sc.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        Date date = new Date();
        SimpleDateFormat formatternd = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
       // Date currentDate = formatternd.parse(date);
        System.out.println(formatternd.format(date));
        return formatter.parse(dateInString);
    }
    public Report readReportType(){
        System.out.print("If you want to run a short report, press 0");
        System.out.print("If you want to run a full report, press 1");
        Scanner scReport = new Scanner(System.in);
        String chooseReport = scReport.nextLine();
        Report report = Report.create(ReportType.fromString(chooseReport));
        return report;
    }
}
