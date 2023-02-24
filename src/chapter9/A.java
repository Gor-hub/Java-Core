package chapter9;

public  class A implements MyInterface, MyAnotherInterface {
    int A = MyInterface.A;

    @Override
    public void method1() {
        System.out.println("1");
    }
    @Override
    public void method2() {
        System.out.println("2");
    }



    public void method3() {
        System.out.println("3");
    }


}
