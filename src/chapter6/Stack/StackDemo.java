package chapter6.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack myStack = new Stack();
        myStack.push(4);
        myStack.push(7);
        myStack.push(88);
        myStack.push(83);
        myStack.push(83);
        myStack.push(83);
        myStack.push(83);
        myStack.push(83);
        myStack.push(77);
        myStack.push(22);
        myStack.push(44);

        int pop = myStack.pop();
        System.out.println(pop);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}
