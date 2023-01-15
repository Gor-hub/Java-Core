package homework.homework7;

public class Calculator {
    public double plus(double x, double y) {
        return x + y;
    }

    public double minus(double x, double y) {
        return x - y;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            System.out.println("number is not divisible by 0");
            return -1;
        }
        return x / y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }
}
