package com.gd.student.service.report;

import com.gd.student.model.Program;
import com.gd.student.model.Student;
import com.gd.student.service.calculate.DateCalculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.gd.student.service.calculate.DateCalculator.calculateEndDate;
import static com.gd.student.service.calculate.DateCalculator.readDate;

public class ShortReport extends Report {
    public ShortReport(DateCalculator dateCalculator) {
        dateCalculator = this.DateCalculator;
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
        System.out.println("Student name: " +student.getLastname()+" " + student.getFirstname()  +" ( " + Student.builder().build().getProgram()+ " ) - Training is not finished. ");
        System.out.println("End date of the course: " + String.format("{%s} {%s}", calculateEndDate(start_date, duration), duration + " day are left until the end."));
        //if (endDateF.before(date))
        ///  System.out.println("Student name: " +student.getLastname()+" " + student.getFirstname()  +" ( " + asigment.getAssigment(student)+ " ) - Training is not finished. ");
        // System.out.println("Training completed: " + String.format("{%s} {%s}", calculateEndDate(start_date, duration), duration + " hours have passed since the end"));
    }

    public int getProgramDuration(Student student){
        int duration = Program.getDuration();
        return duration;
    }
}
