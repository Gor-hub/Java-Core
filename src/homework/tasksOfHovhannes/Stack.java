package homework.tasksOfHovhannes;

import java.util.LinkedList;
import java.util.Queue;

public class Stack<T> {
    Queue<T> mainQueue;
    Queue<T> tempQueue;
    int size = 0;

    public Stack() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    //Implement the Stack methods using only two Queue objects
    public void push(T element) {
        mainQueue.add(element);
        size++;
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (mainQueue.size() > 1) {
            tempQueue.add(mainQueue.poll());
        }
        T tmp = mainQueue.poll();
        mainQueue = tempQueue;
        tempQueue = null;
        size--;
        return tmp;
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        while (mainQueue.size() > 1) {
            tempQueue.add(mainQueue.poll());
        }
        T tmp = mainQueue.peek();
        mainQueue = tempQueue;
        tempQueue = null;
        return tmp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

