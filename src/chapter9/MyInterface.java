package chapter9;
public interface MyInterface  {
    int A = 7;
    void method1();

    private void privateMethod(){
        System.out.println("Private method");
    }
    default void defaultMethod(){
        privateMethod();
        System.out.println("default method can takes private method");
    }
}
