package classwork;

public class Test {
    public static void main(String[] args) {
        int[] array = {20, 12, 2, 3, 4, 8, 6, 7, 8, 9, 10};
        System.out.println(max(array));
    }

    public static int max(int[] array) {


        int max = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {

                max = array[i];

            }

        }

        return max;
    }
}