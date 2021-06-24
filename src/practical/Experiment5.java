package practical;

import java.util.NoSuchElementException;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment5<E> {
    private final int MAX_SIZE;
    private int top;
    private Object[] stack;

    public Experiment5(int size) {
        this.MAX_SIZE = size;
        this.top = -1;
        this.stack = new Object[size];
    }

    public boolean push(E item) {
        top = top + 1;
        if (top >= MAX_SIZE) {
            throw new IndexOutOfBoundsException("Stack Overflow!");
        }
        stack[top] = item;
        return true;
    }

    public E pop() {


}

