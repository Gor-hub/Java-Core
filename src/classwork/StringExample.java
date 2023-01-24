package classwork;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String name = " Poxos Poxosyan ";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println();


        String name1 = "Poxos Poxosyan";
        System.out.println(name1.endsWith("yan"));
        System.out.println(name1.startsWith("P"));
        name1.contains("Pox");
        System.out.println(name1.substring(6));
        System.out.println(name1.substring(6, 9));// 9-th element doesn't enter.
        System.out.println();


        String name3 = "Poxos Poxosyan Poxosi";
        String[] names = name3.split(" ");//The "split()" method divides and save in array.
        for (String s : names) {
            System.out.println(s);
        }
        char[] chars = name3.toCharArray();
        System.out.println(chars[0]);
        //charAt()
        System.out.println(name3.charAt(2));
        for (int i = 0; i < name3.length(); i++) {
            System.out.print(name3.charAt(i));
        }

    }
}
