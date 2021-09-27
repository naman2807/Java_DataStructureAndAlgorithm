package linkedlist.singlylinkedlist;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: linkedlist.singlylinkedlist
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 27-09-2021
 */

public class MySinglyLinkedList<T> {
    private Node<T> head;

    public void addToFront(T value){
        Node<T> node = new Node<>(value);
        node.setNext(head);
        head = node;
    }

    public Node<T> removeFromFront(){
        Node<T> removedValue = head;
        head = removedValue.getNext();
        removedValue.setNext(null);
        return removedValue;
    }

}
