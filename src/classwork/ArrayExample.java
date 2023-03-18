package classwork;

public class ArrayExample  {

    public static void main(String[] args) {

        int[] array = {45, 4, 7, 2, 9, -7};
//        System.out.println(array.length);
//        System.out.println(array[0]);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//        System.out.println(array[array.length - 1]);

        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }


}