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

    public Experiment6() {
        this.top = null;
    }

    public void push(E data){
        StackNode<E> temp = new StackNode<>();
    }
}

class StackNode<E> {
    private E data;
    private StackNode<E> next;

    public StackNode(E data) {
        this.data = data;
    }

    public StackNode(E data, StackNode<E> next) {
        this.data = data;
        this.next = next;
    }

    public StackNode() {
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