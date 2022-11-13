package com.gd.student.service.calculate;

import com.gd.student.model.Program;
import com.gd.student.service.reader.Reader;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static com.gd.student.service.reader.Reader.readDate;

public class DateCalculator extends Object{
    LocalDateTime actualDateTime;
    static LocalDateTime expectedDateTime;
    Date scannerDate;

    public DateCalculator(LocalDateTime expectedDateTime) {

    }

    public LocalDateTime DateCalculator(LocalDateTime expectedDateTime) {
    return expectedDateTime;
    }

   // public LocalDateTime DateCalculator(Object endDate) {
     //   return expectedDateTime;
    //}


    public static void main(String[] args) throws ParseException {
       // new Reader();
        Reader start_date = (Reader) readDate();
        Reader current_date = (Reader) currentDate();
        Program[] newProgram = Program.values();
        for(Program CurrentProgram : newProgram) {
            int duration = CurrentProgram.getDuration() / 8;
            System.out.println(String.format("{%s} {%s}", calculateEndDate(start_date, duration), duration));
        }
    }

    private static Object currentDate() {
        return currentDate();
    }

    public static Date calculateEndDate(Reader startDate, int duration)
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

        while (program.getCourses().iterator().hasNext()) {
            int duration = program.getDuration() / 8;
            assertThat(expectedDateTime);
            System.out.print(expectedDateTime);
        }
        return;

    }


    private static Object assertThat(LocalDateTime plusHours) {
        return expectedDateTime;
    }


}