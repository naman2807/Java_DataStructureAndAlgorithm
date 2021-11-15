package linkedlist.doublylinkedlist;

import java.util.NoSuchElementException;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: linkedlist.doublylinkedlist
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 15-11-2021
 */

public class MyDoublyLinkedList<T> {
    private int size = 0;
    private ListNode<T> head;
    private ListNode<T> tail;

    public MyDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtFront(T data) {
        ListNode<T> temp = new ListNode<>(null, null, data);
        if (isEmpty()) {
            tail = temp;
        } else {
            temp.setNext(head);
            head.setPrevious(temp);
        }
        head = temp;
        size++;
    }

    public void insertLast(T data) {
        ListNode<T> temp = new ListNode<>(null, null, data);
        if (isEmpty()) {
            head = temp;
        } else {
            temp.setPrevious(tail);
            tail.setNext(temp);
        }
        tail = temp;
        size++;
    }

    public void printAllElements() {
        if (head == null) {
            return;
        }
        ListNode<T> pointer = head;
        while (pointer != null) {
            System.out.print(pointer.getData() + " -> ");
            pointer = pointer.getNext();
        }
        System.out.println(" -> null");
    }

    public ListNode<T> deleteFirstNode() {
        if (isEmpty()) {
            throw new NoSuchElementException("Doubly Linked List is empty.");
        }
        ListNode<T> temp = head;
        if (head == tail) {
            tail = null;
        } else {
            temp.getNext().setPrevious(null);
        }
        head = head.getNext();
        temp.setNext(null);
        size--;
        return temp;
    }

    public ListNode<T> deleteLastNode() {
        if (isEmpty()) {
            throw new NoSuchElementException("Doubly Linked List is empty");
        }
        ListNode<T> temp = head;
        if (head == tail) {
            head = null;
        } else {
            temp.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        temp.setPrevious(null);
        size--;
        return temp;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
