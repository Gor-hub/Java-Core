package classwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExample {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Scanner scanner = new Scanner(System.in);
//        Date date = new Date();
//        String dateStr = sdf.format(date);
//        System.out.println(dateStr);
        System.out.println("please write date of birthday(15-02-2020)");
        String dobStr = scanner.nextLine();
        Date date = sdf.parse(dobStr);
        System.out.println(date);
    }
}