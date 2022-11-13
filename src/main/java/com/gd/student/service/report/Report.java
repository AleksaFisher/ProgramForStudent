package com.gd.student.service.report;

import com.gd.student.model.Student;
import com.gd.student.service.calculate.DateCalculator;
import com.gd.student.service.reader.Reader;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.text.ParseException;
import java.time.LocalDateTime;

//import static com.gd.student.service.report.ReportType.builder;

@Getter
@RequiredArgsConstructor

public abstract  class Report {

    public String reportType;
    public static LocalDateTime expectedDateTime;
    protected com.gd.student.service.calculate.DateCalculator DateCalculator;

    //static Report ShortReport;
    public static Report create(ReportType reportType) {
        DateCalculator dateCalculator =  new DateCalculator(expectedDateTime);
        switch (reportType) {
            case SHORT: return new ShortReport(dateCalculator);
            case FULL:return new FullReport(dateCalculator);
            default: throw new IllegalArgumentException("unknow parametr method");
        }
    }

    public abstract void PrintFull(Student student) throws ParseException;

    public abstract void print(Student student) throws ParseException;

    public abstract void print(Student student, Reader start_date);
}