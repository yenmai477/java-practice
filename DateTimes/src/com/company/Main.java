package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Main {

    public static void main(String[] args)  {

        try {
            Date start = stringToDate("12/04/2021");
            Date end = stringToDate("09/04/2021");

            System.out.println(diffDate(start, end));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    public static long diffDate(Date fromDate, Date untilDate) {
        long between = Duration.between(fromDate.toInstant(), untilDate.toInstant()).toDays();
        return between > 0 ? between : -between;

//        long between =  untilDate.getTime() - fromDate.getTime();
//        return between / (1000 * 60 * 60 * 24);
    }
    public static Date stringToDate(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(dateStr);
    }
}
