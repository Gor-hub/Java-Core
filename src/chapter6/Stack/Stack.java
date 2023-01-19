package chapter6.Stack;

public class Stack {

    int[] array = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack has not place");
        } else {
            array[++tos] = item;
        }
    }
    int pop() {
        if (tos < 0) {
            System.err.println("Stack is empty");
            return 0;
        }
        return array[tos--];
    }
}
