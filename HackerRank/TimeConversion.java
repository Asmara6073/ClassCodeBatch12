package HackerRank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    /**
     *Given a time in -hour AM/PM format, convert it to military (24-hour) time.
     * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
     * 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     */

    /**
     * Create a method that takes String that is in 12 hour time
     * Convert the string from 12 hour time to 24 hour time
     * Return the 24-hour time String
     */

    public static String timeconversion(String s)  {
        DateFormat informat=new SimpleDateFormat("hh:mm:ssaa");
        // will format date in 12 hour time (aa is am/pm marker)
        DateFormat outformat=new SimpleDateFormat("HH:mm:ss");
        //will format date in 24 hour time
        Date date=null;

        try{
            date=informat.parse(s);// turn the string date we are given into date format data type
        }catch(ParseException e){
            e.printStackTrace();
        }

        String myDate=null;
        if(date!=null){
             myDate=outformat.format(date);
             //turn the 12 hour time into 24 hour
        }
        return myDate;

    }

    public static void main(String[] args) {




    }

}
