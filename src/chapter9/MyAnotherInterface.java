package chapter9;

public interface   MyAnotherInterface extends MyInterface {

    void method2();
    default void method3(){
        System.out.println("Hello");

    }
}
