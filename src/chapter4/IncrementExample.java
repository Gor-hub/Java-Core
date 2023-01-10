package chapter4;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int w = 10;
        int z = ++w;
        System.out.println("w = " + w);
        System.out.println("z = " + z);
    }
}
