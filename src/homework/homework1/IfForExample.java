package homework.homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int min;
        int max;
        if (a > b) {
            System.out.println("Variable a is greater than variable b");
            min = b;
            max = a;
        } else {
            System.out.println("Variable b is greater than variable b ");
            min = a;
            max = b;
        }
        for (int i = min; i <= max; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
         char ch1 = (char) a;
         char ch2 = (char) b;
        System.out.println(ch1);
        System.out.println(ch2);
    }
}
