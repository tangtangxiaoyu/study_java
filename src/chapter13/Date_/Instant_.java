package chapter13.Date_;

import java.time.Instant;
import java.util.Date;

public class Instant_ {
    public static void main(String[] args) {
        Instant  i = Instant.now();
        System.out.println(i);
        Date d = Date.from(i);
        System.out.println(d.toInstant());
    }
}
