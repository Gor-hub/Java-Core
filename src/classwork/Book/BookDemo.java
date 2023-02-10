package classwork.Book;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();

        Boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add book");
            System.out.println("Please input 2 for printing all book");
            System.out.println("Please input 3 for search book by name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input title");
                    String title = scanner.nextLine();
                    System.out.println("Please input author");
                    String author = scanner.nextLine();
                    System.out.println("Please input price");
                    String priceStr = scanner.nextLine();
                    double price = Double.parseDouble(priceStr);
                    Book book = new Book(title, author, price);
                    bookStorage.add(book);
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.searchByName(keyword);
                    break;
                default:
                    System.err.println("WRONG COMMAND. Please try again");
            }
        }
        System.out.println("Bay bay");
    }
}