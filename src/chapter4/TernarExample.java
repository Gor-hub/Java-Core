package chapter4;

public class TernarExample {
    public static void main(String[] args) {
        int a = 55;
        int b = 7;
        int c = a > b ? a : b;
//        if (a > b) {
//            c = a;
//        }else {
//            c = b;
//        }
        System.out.println(c);
    }
}
