package homework.homework9;

public class BraceChecker {
    private String txt;

    BraceChecker(String text) {
        txt = text;
    }

    public void check() {
        Stack stack = new Stack();
        char[] chars = new char[txt.length()];
        int numOfBrace = 1;
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                char tmp;
                switch (c) {

                    case ')':
                        tmp = stack.pop();
                        if (tmp == '{') {
                            System.out.println("Error: opened { but closed ) at " + i);
                        } else if (tmp == '[') {
                            System.out.println("Error: opened [ but closed ) at " + i);
                        } else {
                            System.out.println(numOfBrace + "-th pare of braces is OK");
                            numOfBrace++;
                        }
                        break;
                    case ']':
                        tmp = stack.pop();
                        if (tmp == '{') {
                            System.out.println("Error: opened { but closed ] at " + i);
                        } else if (tmp == '(') {
                            System.out.println("Error: opened ( but closed ] at " + i);
                        } else {
                            System.out.println(numOfBrace + "-th pare of braces is OK");
                            numOfBrace++;
                        }
                        break;
                    case '}':
                        tmp = stack.pop();
                        if (tmp == '(') {
                            System.out.println("Error: opened ( but closed } at " + i);
                        } else if (tmp == '[') {
                            System.out.println("Error: opened [ but closed } at " + i);
                        } else {
                            System.out.println(numOfBrace + "-th pare of braces is OK");
                            numOfBrace++;
                        }
                        break;
                }
            }
        }
    }
}

