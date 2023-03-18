package chapter8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class ABDemo {

    public static void main(String[] args) {
        Instant parse = Instant.parse("2023-01-24T01:58:58Z");
        LocalDate from = parse.atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(from);

    }
}