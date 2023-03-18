package chapter7;

public class ParseIntExample {

    public static void main(String[] args) {
        String numberStr = args[1];
        int num = Integer.parseInt(numberStr);
        System.out.println(num);
    }
}