package stack;

import java.util.NoSuchElementException;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: stack
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 16-11-2021
 */

public class MyStack<T> {
    private StackNode<T> top;
    private int length;

    public MyStack() {
        this.top = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(T data) {
        StackNode<T> temp = new StackNode<>(null, data);
        temp.setNext(top);
        top = temp;
        length++;
    }

    public StackNode<T> pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        StackNode<T> temp = top;
        top = top.getNext();
        temp.setNext(null);
        return temp;
    }

//    public T pop() {
//        if (isEmpty()) {
//            throw new NoSuchElementException("Stack is empty.");
//        }
//        T data = top.getData();
//        top = top.getNext();;
//        return data;
//    }
//
    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Stack is empty");
        }
        return top.getData();
    }
}
