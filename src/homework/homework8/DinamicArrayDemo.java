package homework.homework8;

public class DinamicArrayDemo {
    public static void main(String[] args) {
        DinamicArray array = new DinamicArray();
        for (int i = 0; i < 10; i++) {
            array.add(i + 1);
        }
        array.print();
        array.add(11);
        array.add(11);
        array.add(12);
        array.getByIndex(12);
        array.getByIndex(5);
        array.print();
        array.deleteByIndex(-1);
        array.deleteByIndex(17);
        array.set(0, 55);
        array.set(40, 55);
        array.add(1, 88);
        array.add(-2, 88);
        System.out.println(array.exists(99));
        System.out.println(array.exists(12));
        System.out.println(array.getIndexByValue(77));
        System.out.println(array.getIndexByValue(11));

    }

}
