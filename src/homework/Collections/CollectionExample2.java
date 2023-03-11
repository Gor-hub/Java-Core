package homework.Collections;

import java.util.*;

public class CollectionExample2  {
    public static void main(String[] args) {
        System.out.println("Please input names");
        Set<String> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] names = data.split(",");
        set.addAll(List.of(names));
        for (String s : set) {
            System.out.print("[" + s + "] ");
        }
    }
}
