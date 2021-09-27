package linkedlist.singlylinkedlist;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: linkedlist.singlylinkedlist
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 27-09-2021
 */

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
