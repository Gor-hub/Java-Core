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
        System.out.println();
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("There is no element at this index");
        } else {
            for (int i = index; i < array.length - 1; i++) {
                if (index + 1 == array.length) {
                    break;
                } else {
                    array[index++] = array[i + 1];
                }
            }
            print();
        }
    }

    public void set(int index, int value) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("There is no element at this index");
        } else {
            array[index] = value;
            print();
        }
    }

    public void add(int index, int value) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("There is no element at this index");
        } else {
            for (int i = index; i < array.length; i++) {
                if (array[index + 1] == array.length) {
                    extend();
                }
                int tmp = value;
                value = array[i];
                array[i] = tmp;
            }
            print();
        }
    }

    public boolean exists(int value) {
        boolean bul = false;
        for (int i : array) {
            if (i == value) {
                bul = true;
            }
        }
        return bul;
    }

    public int getIndexByValue(int value) {
        int count = 0;
        for (int i : array) {
            if (i == value) {
                count++;
            }
        }
        if (count == 0) {
            return -1;
        } else return count;
    }
}
