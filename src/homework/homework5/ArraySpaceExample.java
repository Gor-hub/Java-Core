package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] resalt = new char[8];
        int spaceCount = 0;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                ++spaceCount;
            } else {
                break;
            }

        }
        for (int i = 0; i < resalt.length; i++) {
            resalt[i] = spaceArray[spaceCount];
            spaceCount++;
        }
        for (char c : resalt) {
            System.out.print(c);
        }
    }
}