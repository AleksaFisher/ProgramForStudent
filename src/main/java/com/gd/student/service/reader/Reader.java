package com.gd.student.service.reader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Reader extends Date {
    public static Date readDate() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        String dateInString = sc.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        Date date = new Date();
        SimpleDateFormat formatternd = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
       // Date currentDate = formatternd.parse(date);
        System.out.println(formatternd.format(date));
        return formatter.parse(dateInString);
    }

}
