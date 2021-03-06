package linkedlist.circularlinkedlist;

import linkedlist.singlylinkedlist.Node;

import java.util.NoSuchElementException;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: linkedlist.circularlinkedlist
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 03-12-2021
 */

public class MyCircularSinglyLinkedList<T> {
    private Node<T> last;
    private int length;

    public MyCircularSinglyLinkedList() {
        this.last = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    // Brute Force Method
    public void createCircularLinkedList() {
        Node<Integer> first = new Node<>(1);
        Node<Integer> second = new Node<>(2);
        Node<Integer> third = new Node<>(3);
        Node<Integer> fourth = new Node<>(4);

        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(first);
    }

    // Traversal
    public void display() {
        if (last == null) {
            return;
        }

        Node<T> first = last.getNext();
        while (first != last) {
            System.out.print(first.getValue() + " ");
            first = first.getNext();
        }
        System.out.println(first.getValue());
    }

    // Insert the node at the start of circular linked list
    public void insertFirst(T data) {
        Node<T> temp = new Node<>(data);
        if (last == null) {
            last = temp;
        } else {
            temp.setNext(last.getNext());
        }
        last.setNext(temp);
        length++;
    }

    // Insert the node at the end of circular linked list
    public void insertLast(T data) {
        Node<T> temp = new Node<>(data);
        if (last == null) {
            last = temp;
            last.setNext(temp);
        } else {
            temp.setNext(last.getNext());
            last.setNext(temp);
            last = temp;
        }
        length++;
    }

    // Remove the first node from circular linked list
    public Node<T> deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Circular Linked List is empty!");
        }
        Node<T> temp = last.getNext();
        if (last.getNext() == last) {
            last = null;
        } else {
            last.setNext(temp.getNext());
        }
        temp.setNext(null);
        length--;
        return temp;
    }
}
