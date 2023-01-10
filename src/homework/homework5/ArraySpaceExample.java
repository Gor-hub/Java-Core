package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] resalt = new char[8];
        int a = 0;
        for (int i = 0; i < spaceArray.length - 1; i++) {
            if (spaceArray[i] != ' ' || spaceArray[i + 1] == 'b') {
                resalt[a] = spaceArray[i];
                a++;
            }
        }
        for (char c : resalt) {
            System.out.print(c);
        }
    }
}