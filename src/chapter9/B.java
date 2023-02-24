package chapter9;

public class B {
    public static void main(String[] args) {
        MyInterface my = new A();
        my.method1();
      //  my.method2(); It's forbidden (reference "my" belongs to the MyInterface) method2() belongs to the
        MyAnotherInterface my2 = new A();
        my2.method2();
        my2.method3();

    }
}
