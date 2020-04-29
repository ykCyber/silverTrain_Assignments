package day47.collections;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

    Stack<Integer> integerStack = new Stack<>();
        integerStack.add(50);
        integerStack.add(250);
        integerStack.add(150);
        integerStack.add(50);
        System.out.println("integerStack.toString() = " + integerStack.toString());
        integerStack.add(1);
        System.out.println(integerStack.peek());
        integerStack.pop();// removes top element
        System.out.println(integerStack.peek());
    }
}