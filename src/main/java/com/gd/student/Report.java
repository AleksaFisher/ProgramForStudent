package com.gd.student;

import com.gd.student.model.Program;
import com.gd.student.model.Student;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Report {
    public Report(ProgrammAsigment asigment) {
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

    public  void Print(Student student) throws ParseException {
        Date start_date = readDate();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));
        int duration = getProgramDuration(student) / 8;
        //String EndDate = String.format("{%s} {%s}", calculateEndDate(start_date, duration), duration);
        //SimpleDateFormat format = new SimpleDateFormat();
       // format.applyPattern("EEEE MM.dd HH:mm:ss yyyy");
        //Date endDateF= format.parse(EndDate);
        //if (endDateF.after(date))
        System.out.println("Student name: " +student.getLastname()+" " + student.getFirstname()  +" ( " + asigment.getAssigment(student)+ " ) - Training is not finished. ");
        System.out.println("End date of the course: " + String.format("{%s} {%s}", calculateEndDate(start_date, duration), duration + " day are left until the end."));
        //if (endDateF.before(date))
      ///  System.out.println("Student name: " +student.getLastname()+" " + student.getFirstname()  +" ( " + asigment.getAssigment(student)+ " ) - Training is not finished. ");
       // System.out.println("Training completed: " + String.format("{%s} {%s}", calculateEndDate(start_date, duration), duration + " hours have passed since the end"));
    }
    public Date readDate() throws ParseException {
        System.out.print("Enter date: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date: ");
        String dateInString = sc.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        //SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", Locale.ENGLISH);
        Date dateOutString = formatter.parse(dateInString);
        return dateOutString;
    }

}
