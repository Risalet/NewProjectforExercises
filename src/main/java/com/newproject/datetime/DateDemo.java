package com.newproject.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat ad1=new SimpleDateFormat("M-d-yyyy");
        SimpleDateFormat ad2=new SimpleDateFormat("M-d-yyyy hh:mm:ss");
        SimpleDateFormat ad3=new SimpleDateFormat("YYYY-M-d hh:mm:ss");
        System.out.println(ad1.format(date));
        System.out.println(ad2.format(date));
        System.out.println(ad3.format(date));

        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getDayOfYear());
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.plusDays(10));
        System.out.println();dateTime.minusDays(1);



    }
}
