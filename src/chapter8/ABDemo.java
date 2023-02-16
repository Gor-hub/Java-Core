package chapter8;

public class ABDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(1, 1);
        A b = new B(2,2);
        System.out.println(a.x);
    }
}