package chapter12;

public class WrapperCassExample {
    public static void main(String[] args) {
        //if range of value is from -128 to 127 value copies to Integer Pool
        Integer a = 9;  //value copied to Integer Pool
        Integer b = 9;  //value copied to Integer Pool
        System.out.println(a == b);

        //if range of value is not from -128 to 127 value copies to Heap
        Integer c = 128;  //value copied to Heap
        Integer d = 128;  //value copied to Heap
        System.out.println(c == d);
        System.out.println(c.equals(d));
        Double dob = d.doubleValue();
        System.out.println(dob);
    }
}
