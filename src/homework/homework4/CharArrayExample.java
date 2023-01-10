package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int amount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                amount++;
            }
        }
        System.out.println("character count 'o'= " + amount);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        if (chars2.length % 2 == 0) {
            System.out.print("2 medium characters of chars2 array: ");
            System.out.println(chars2[(chars2.length / 2) - 1] + ", " + chars2[chars2.length / 2]);
        } else {
            System.out.println("chars2 array doesn't have 2 medium characters");
        }
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean b;
        if (chars3[(chars3.length) - 2] == 'l' && chars3[(chars3.length) - 1] == 'y') {
            b = true;
        } else {
            b = false;
        }
        System.out.println(b);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}
