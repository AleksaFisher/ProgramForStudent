package com.gd.student;
import com.gd.student.model.Course;
import com.gd.student.model.Program;
import lombok.val;
import com.gd.student.StudentBuilder;

import java.io.Console;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

public class TestEquals extends Object{
    LocalDateTime actualDateTime;
    static LocalDateTime expectedDateTime;
    Date scannerDate;

    public static void main(String[] args) throws ParseException {
        Date start_date = readDate();
       Program[] newProgram = Program.values();
       for(Program CurrentProgram : newProgram) {
           int duration = CurrentProgram.getDuration() / 8;
           System.out.println(String.format("{%s} {%s}", calculateEndDate(start_date, duration), duration));
       }
    }
    public static Date calculateEndDate(Date startDate, int duration)
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

    private static void FinishDate(Program program, Date startDate) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter date: ");
//        String dateString = sc.next();
//        Calendar cal = Calendar.getInstance();
//        //LocalDateTime actualDateTime = LocalDateTime.of(2020, 6, 1, 10, 0);
//        LocalDateTime actualDateTime = LocalDateTime.parse(dateString);
//        int duration;
        while (program.getCourses().iterator().hasNext()) {
            int duration = program.getDuration() / 8;
//            expectedDateTime = actualDateTime.plusDays(duration);
         //   expectedDateTime = actualDateTime.plusDays(duration);
            assertThat(expectedDateTime);
            System.out.print(expectedDateTime);
        }
        return;

    }


    private static Object assertThat(LocalDateTime plusHours) {
        return expectedDateTime;
    }
    //public static void setDate(Date date) {}

    public static Date readDate() throws ParseException {
        System.out.print("Enter date: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date: ");
        String dateInString = sc.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Date dateOutString = formatter.parse(dateInString);
        return dateOutString;
    }
}
