package homework.homework9;

public class Stack {

    char[] array = new char[10];
   int tos;

    public Stack() {
        tos = -1;


    }

    void push(char item) {

        if (tos == array.length - 1) {
            extend();
        } else {
            array[++tos] = item;
        }
    }

    public char pop() {
        if (tos < 0) {
            System.err.println("Stack is empty");
            return 0;
        }
        return array[tos--];
    }
    private void extend() {
        char[] arr = new char[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        array = arr;
    }
    int getTos(){
        return tos;
    }
}
