package practical;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment6<E>{
    private StackNode<E> top;
}

class StackNode<E> {
    private final E data;
    private StackNode<E> next;

    public StackNode(E data) {
        this.data = data;
    }

    public StackNode(E data, StackNode<E> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public StackNode<E> getNext() {
        return next;
    }

    public void setNext(StackNode<E> next) {
        this.next = next;
    }
}