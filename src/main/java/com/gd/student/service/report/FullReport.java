package com.gd.student.service.report;

import com.gd.student.model.Student;
import com.gd.student.service.calculate.DateCalculator;
import com.gd.student.service.reader.Reader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.gd.student.service.calculate.DateCalculator.calculateEndDate;
import static com.gd.student.service.reader.Reader.readDate;
//import static com.gd.student.service.calculate.DateCalculator.readDate;

public class FullReport extends Report{

   // private final DateCalculator dateCalculator;

    public FullReport(DateCalculator dateCalculator) {
        dateCalculator = this.DateCalculator;
    }
//@Override
    public  void PrintFull(Student student, Reader start_date)  {
        int duration = getProgramDuration(student) / 8;
        System.out.println("Student name: " + student.getLastname() +" " + student.getFirstname());
        System.out.println("Working time: from 10 to 18");
        System.out.println("Program name " + Student.builder().build().getProgram());
        System.out.println("program duration (hours) " + duration);
        System.out.println("Start date " + start_date);
        System.out.println("End date: " + String.format("{%s} {%s}", calculateEndDate(start_date, duration), duration));
        System.out.println("how much time has passed / remains until completion" + duration + " days" );



    }

  private int getProgramDuration(Student student) {

      // Student duration = null;
      return getProgramDuration();
  }

    private int getProgramDuration() {
        return getProgramDuration();
    }

    @Override
    public void PrintFull(Student student) throws ParseException {

    }

    @Override
    public void print(Student student) {

    }

    @Override
    public void print(Student student, Reader start_date) {

    }
}
