package homework.homework6;

public class ArrayUtil {
    public void maxOfArray(int[] array) {
        int max = array[0];
       /* for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }*/
        for (int i : array) {
            if (i > max){
               max = i;
            }
        }
        System.out.println("max element of array: " + max);
        System.out.println();
    }

    public void minOfArray(int[] array) {
        int min = array[0];
        /*for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }*/
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("min element of array: " + min);
        System.out.println();
    }

    public void evenOfArray(int[] array) {
        System.out.print("Even elements of the array: ");
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println('\n');
    }

    public void oddOfArray(int[] array) {
        System.out.print("Odd elements of the array: ");
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println('\n');
    }

    public void countOfOdd(int[] array) {
        int oddElements = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                oddElements++;
            }
        }
        System.out.println("Count of even elements: " + oddElements);
        System.out.println();
    }

    public void countOfEven(int[] array) {
        int evenElements = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                evenElements++;
            }
        }
        System.out.println("Count of even elements: " + evenElements);
        System.out.println();
    }

    public void sumOfArray(int[] array) {
        int sumOfElements = 0;
        for (int j : array) {
            sumOfElements += j;
        }
        System.out.println("Sum of array elements: " + sumOfElements);
        System.out.println();
    }

    public void averageValue(int[] array) {
        int sumOfElements = 0;
        int averageValue;
        for (int j : array) {
            sumOfElements += j;
        }
        averageValue = sumOfElements / array.length;
        System.out.println("Average value of the array: " + averageValue);
        System.out.println();
    }

    public void allElemnts(int[] array) {
        System.out.print("All Elements of array: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println('\n');

    }
}
