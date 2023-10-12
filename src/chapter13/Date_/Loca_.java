package chapter13.Date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Loca_ {
    public static void main(String[] args) {

        LocalDateTime l1 = LocalDateTime.now();
        System.out.println(l1);

        DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(d.format(l1));
    }
}
