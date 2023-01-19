package homework.homework8;

public class DinamicArray {
    private int[] array = new int[10];

    private int size = 0;

    public void add(int value) {
        if (size > array.length - 1) {
            extend();
            array[size++] = value;

        } else {
            array[size++] = value;
        }
    }

    private void extend() {
        int[] arr = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        array = arr;
    }

    public int getByIndex(int index) {
        if (array[index] < array[size]) {
            return array[index];
        } else {
            return -1;
        }
    }

    public void print() {
        for (int i : array) {
            System.out.print(i + " ");

        }
    }
}
