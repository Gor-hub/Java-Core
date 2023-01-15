package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.plus(5,6));
        System.out.println(calc.minus(15,8));
        System.out.println(calc.divide(20,5));
        System.out.println(calc.divide(38,0));
        System.out.println(calc.multiply(7,15));
    }
}
