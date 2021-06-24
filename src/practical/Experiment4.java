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
    private CircularListNode<E> tail;

    public void add(E data){
        CircularListNode<E> newNode = new CircularListNode<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
    }
}

class CircularListNode<E> {
    private E data;
    private CircularListNode<E> next;

    public CircularListNode(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public CircularListNode<E> getNext() {
        return next;
    }

    public void setNext(CircularListNode<E> next) {
        this.next = next;
    }
}