package com.gd.student.service.report;

import com.gd.student.model.Program;
import com.gd.student.model.Student;
import com.gd.student.service.calculate.DateCalculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.gd.student.service.calculate.DateCalculator.calculateEndDate;
import static com.gd.student.service.calculate.DateCalculator.readDate;

public class FullReport extends Report{

   // private final DateCalculator dateCalculator;

    public FullReport(DateCalculator dateCalculator) {
        dateCalculator = this.DateCalculator;
    }

    public  void PrintFull(Student student) throws ParseException {
        Date start_date = readDate();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));
        int duration = getProgramDuration(student) / 8;
        System.out.println("Student name: " +student.getLastname()+" " + student.getFirstname());
        System.out.println("Working time: from 10 to 18");
        System.out.println("Program name " + Student.builder().build().getProgram());
        System.out.println("program duration (hours) " + duration);
        System.out.println("Start date " + start_date);
        System.out.println("End date: " + String.format("{%s} {%s}", calculateEndDate(start_date, duration), duration));
        System.out.println("how much time has passed / remains until completion" + duration + " days" );



    }

    private int getProgramDuration(Student student) {
        int duration = Program.getDuration();
        return duration;
    }
}
