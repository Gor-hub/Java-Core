package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];

            if (min > array[i])
                min = array[i];
        }
        int enenElements = 0;
        int oddElements = 0;
        int averageValue;
        int sumOfElements = 0;
        int middleElement;
        System.out.println();
        System.out.println("Array max: " + max);
        System.out.println("Array min: " + min);
        System.out.print("Even elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                enenElements++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddElements++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            sumOfElements += array[i];
        }
        averageValue = sumOfElements / array.length;
        System.out.println("Average value of the array: " + averageValue);
        System.out.println("Sum of array elements: " + sumOfElements);
        System.out.println("Quantity of even elements: " + enenElements);
        System.out.println("Quantity of odd elements: " + oddElements);
        System.out.println("First element of the array: " + array[0]);
        System.out.println("Last element of the array: " + array[array.length - 1]);
        if (array.length % 2 != 0) {
            middleElement = array[(array.length - 1) / 2 + 1];
            System.out.println("Middle element of the array: " + middleElement);
        } else
            System.out.println("Array doesn't have middle element");
    }
}
