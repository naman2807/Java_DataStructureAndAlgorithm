package practical;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment4<E> {
    private CircularListNode<E> head;
}

class CircularListNode<E> {

    private int data;
    private CircularListNode<E> next;

    public CircularListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CircularListNode<E> getNext() {
        return next;
    }

    public void setNext(CircularListNode<E> next) {
        this.next = next;
    }
}