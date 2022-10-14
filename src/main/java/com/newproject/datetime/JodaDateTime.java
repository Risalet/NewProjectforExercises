package com.newproject.datetime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.time.ZoneId;
import java.util.Set;

public class JodaDateTime {
    public static void main(String[] args) {
        DateTime dateTime=new DateTime(DateTimeZone.UTC);
        System.out.println(dateTime);
        DateTimeZone dateTimeZone=DateTimeZone.forID("Asia/Urumqi");
        DateTime urumqiTime=new DateTime(dateTimeZone);
        System.out.println(urumqiTime);
        Set<String> availabeTimeZones= ZoneId.getAvailableZoneIds();
        for(String countryId:availabeTimeZones){
            System.out.println(countryId);
        }
        System.out.println(dateTime.getMonthOfYear());
        System.out.println(dateTime.getDayOfWeek());

        DateTime beginDate=new DateTime("2022-9-30");
        DateTime endTime=new DateTime();
        Period period=new Period(beginDate,endTime, PeriodType.time());
        System.out.println("Total exectutuon Date is:" +period.getDays());


    }
}
