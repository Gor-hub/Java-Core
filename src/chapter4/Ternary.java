package chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0? -i : i;// get absolute
                          // value of variable i
        System.out.print("Absolute value");
        System.out.println(i + " equals " + k);
        i = -10;
        k = i < 0? -i : i;// get absolute
                          // value of variable i
        System.out.print("Absolute value");
        System.out.println(i + " equals " + k);

    }
}
