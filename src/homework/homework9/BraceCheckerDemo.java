package homework.homework9;

import java.util.Scanner;

public class BraceCheckerDemo {
    public static void main(String[] args) {

        BraceChecker brace = new BraceChecker("Hello [from) (Java}");
        brace.check();
        System.out.println();
        BraceChecker brace1 = new BraceChecker("Hello (from) {Java}");
        brace1.check();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        BraceChecker brace3 = new BraceChecker(text);
        brace3.check();
    }
}
