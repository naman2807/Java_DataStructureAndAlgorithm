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
    private int size = 0;

    // Time Complexity: O(1)
    public void addToFront(T value) {
        Node<T> node = new Node<>(value);
        node.setNext(head);
        head = node;
        size++;
    }

    // Time Complexity: O(1)
    public T removeFromFront() {
        if (head == null) {
            return null;
        }
        Node<T> removedValue = head;
        head = removedValue.getNext();
        removedValue.setNext(null);
        size--;
        return removedValue.getValue();
    }

    public int getSize() {
        return size;
    }

    // Time Complexity: O(1)
    public boolean isEmpty() {
        return head == null;
    }

    // Time Complexity: O(n)
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }

        System.out.println("null");
    }

    // Time Complexity: O(n)
    public void addToLast(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
            head.setNext(null);
            size++;
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
        node.setNext(null);
        size++;
    }


    // Time Complexity: O(n)
    public T removeFromLast() {
        if (head == null) {
            return null;
        }
        Node<T> previousValue = head;
        for (int i = 0; i < size - 2; i++) {
            previousValue = previousValue.getNext();
        }
        Node<T> removedValue = previousValue.getNext();
        previousValue.setNext(null);
        size--;
        return removedValue.getValue();
    }
}
