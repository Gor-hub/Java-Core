package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i <= array.length - 1; i++) {
            if (max < array[i])
                max = array[i];

            if (min > array[i])
                min = array[i];
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}
