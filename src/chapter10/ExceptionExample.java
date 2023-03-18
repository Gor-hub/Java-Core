package chapter10;

public class ExceptionExample {
    public static void main(String[] args) {
        String numStr = "677t";
        int a = Integer.parseInt(numStr);
        System.out.println(a);
    }
}