package stack;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: stack
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 16-11-2021
 */

public class StackNode<T> {
    private StackNode<T> next;
    private T data;

    public StackNode(StackNode<T> next, T data) {
        this.next = next;
        this.data = data;
    }

    public StackNode<T> getNext() {
        return next;
    }

    public void setNext(StackNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
