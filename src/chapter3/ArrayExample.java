package chapter3;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = {33, 44, 5643, -2, 77};

        int[][] numbersTwoD = {
                {8,9},
                {6,5,4}
        };

        for (int i = 0; i < 5; i++) {
            if(numbers[i] == 77){
                System.out.println(i);
            }
        }

        System.out.println();


        int[] myArray = new int[10];

        //add numbers to array
        for (int i = 0; i < 10; i++) {
            myArray[i] = i + 1;
        }
        //print numbers from array
        for (int i = 0; i < 10; i++) {
            System.out.println(myArray[i]);
        }


    }

}