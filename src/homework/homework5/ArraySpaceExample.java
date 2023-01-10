package homework.homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        // ---------VARIANT 1--------------

        int beginSpaceCount = 0;
        int endSpaceCount = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                ++beginSpaceCount;
            } else {
                break;
            }
        }
        for (int i = spaceArray.length - 1; i >= 0; i--) {
            if (spaceArray[i] == ' ') {
                ++endSpaceCount;
            } else {
                break;
            }
        }
        char[] resalt = new char[spaceArray.length - beginSpaceCount - endSpaceCount];
        int a = 0;
        for (int i = 0; i < resalt.length; i++) {
            resalt[i] = spaceArray[beginSpaceCount];
            beginSpaceCount++;
        }
        for (char c : resalt) {
            System.out.print(c);
        }

        /// ---------VARIANT 2--------------

   /*     char[] resalt = new char[8];
        int beginSpaceCount = 0;
        int endSpaceCount = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                ++beginSpaceCount;
            } else {
                break;
            }
        }
        for (int i = spaceArray.length - 1; i >= 0; i--) {
            if (spaceArray[i] == ' ') {
                ++endSpaceCount;
            } else {
                break;
            }
        }int a = 0;
        for (int i = 0; i < spaceArray.length - 1; i++) {
            if (i >= beginSpaceCount && i < (spaceArray.length - endSpaceCount)) {
                resalt[a] = spaceArray[i];
                a++;
            }
        }
        for (char c : resalt) {
            System.out.print(c);
        }*/

        // ---------VARIANT 3--------------

         /*   char[] resalt = new char[8];
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
        }*/

    }
}