package classwork.Book;

public class BookStorage {
    private Book[] array = new Book[10];

    private int size = 0;

    public void add(Book value) {
        if (size > array.length - 1) {
            extend();
            array[size++] = value;

        } else {
            array[size++] = value;
        }
    }

    private void extend() {
        Book[] arr = new Book[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        array = arr;
    }


    public void print() {
        for (Book i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if (book.getTitle().contains(keyword)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book with " + keyword + "not found!");
        }
    }
}
