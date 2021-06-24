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
            addFirst(newNode);
        }else {
            addAfter(newNode);
        }
    }

    private void addAfter(CircularListNode<E> newNode) {
        tail.setNext(newNode);
        tail = newNode;
        tail.setNext(head);
    }

    private void addFirst(CircularListNode<E> newNode) {
        head = newNode;
        tail = newNode;
        newNode.setNext(head);
    }

    public void display(){
        CircularListNode<E> currentNode = head;
        if(head == null){
            System.out.println("List is empty.");
        }else {
            while (currentNode != head){
                System.out.println("" + currentNode.getData());
                currentNode = currentNode.getNext();
            }
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