package chapter5;

public class ForEach {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int õ : nums) {
            System.out.println("Value is: " + õ);
                    sum += õ;
        }
        System.out.println("The sum is: " + sum);

        }
    }