package chapter8;

public class A {

    int i;
    int j;
    private int c;

    A(int a) {
        System.out.println("constructor A");
        c = a;
    }

    void method1() {
        System.out.println("method 1");
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}