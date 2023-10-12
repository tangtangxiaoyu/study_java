package chapter13.Date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);
        Date d2 = new Date(45654465);
        System.out.println(d1.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(d2));

        String s = "2023-10-12 10:02:00";
        Date d5 = simpleDateFormat.parse(s);
        System.out.println(d5);

    }
}
