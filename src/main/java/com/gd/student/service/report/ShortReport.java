package com.gd.student.service.report;

import com.gd.student.model.Student;
import com.gd.student.service.reader.Reader;

import java.text.ParseException;

import static com.gd.student.service.calculate.DateCalculator.calculateEndDate;
//import static com.gd.student.service.calculate.DateCalculator.readDate;


public class ShortReport extends Report {
    public ShortReport(com.gd.student.service.calculate.DateCalculator dateCalculator) {
        dateCalculator = this.DateCalculator;
        reportType = ReportType.SHORT.toString();
    }

    @Override
    public void PrintFull(Student student) {


    }

    @Override
    public void print(Student student) throws ParseException {

    }

    @Override
    public  void print(Student student, Reader start_date)  {
        int duration = getProgramDuration(student) / 8;
        System.out.println("Student name: " +student.getLastname()+" " + student.getFirstname()  +" ( " + Student.builder().build().getProgram()+ " ) - Training is not finished. ");
        System.out.println("End date of the course: " + String.format("{%s} {%s}", calculateEndDate((Reader) start_date, duration), duration + " day are left until the end."));
    }

    private int getProgramDuration(Student student) {

        return getProgramDuration();
    }

    private int getProgramDuration() {
        return getProgramDuration();
    }

}
