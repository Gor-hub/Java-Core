package homework.homework8;

public class DinamicArrayDemo {
    public static void main(String[] args) {
        DinamicArray array = new DinamicArray();
        for (int i = 0; i < 10; i++) {
            array.add(i+1);
        }
        array.print();
        array.add(11);
        array.add(12);
        array.getByIndex(12);
        array.getByIndex(5);
        System.out.println();
        array.print();

    }

}
