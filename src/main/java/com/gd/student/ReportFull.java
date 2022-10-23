package com.gd.student;

import com.gd.student.model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ReportFull {
    public ReportFull(ProgrammAsigment asigment) {
        this.asigment = asigment;
    }

    ProgrammAsigment asigment;
    public int getProgramDuration(Student student){
        int duration =  asigment.getAssigment(student).getDuration();
        return duration;
    }
    public Date calculateEndDate(Date startDate, int duration)
    {
        Calendar startCal = Calendar.getInstance();

        startCal.setTime(startDate);

        for (int i = 1; i < duration; i++)
        {
            startCal.add(Calendar.DAY_OF_MONTH, 1);
            while (startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
            {
                startCal.add(Calendar.DAY_OF_MONTH, 1);
            }
        }

        return startCal.getTime();
    }
    public  void PrintFull(Student student) throws ParseException {
        Date start_date = readDate();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));
        int duration = getProgramDuration(student) / 8;
        System.out.println("Student name: " +student.getLastname()+" " + student.getFirstname());
        System.out.println("Working time: from 10 to 18");
        System.out.println("Program name" + asigment.getAssigment(student));
        System.out.println("program duration (hours)" + duration);
        System.out.println("Start date" + start_date);
        System.out.println("End date: " + String.format("{%s} {%s}", calculateEndDate(start_date, duration)));
        System.out.println("how much time has passed / remains until completion" );



    }
    public Date readDate() throws ParseException {
        System.out.print("Enter date: ");
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter date: ");
        String dateInString = sc.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        //SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH);
        Date dateOutString = formatter.parse(dateInString);
        return dateOutString;
    }

}
