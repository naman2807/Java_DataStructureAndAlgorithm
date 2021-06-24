package practical;

import practical.Node;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment8<E>{
    private Node<E> front; //head
    private Node<E> rear; //tail
    private int size;
    public void enqueue(E element) {
        Node<E> node = new Node<>(element);
        if(!isEmpty()){
            rear.setNext(node);
            rear = node;
        }
        else{
            front = node;
            rear = node;
        }
        size++;
        System.out.println("Element inserted");
    }

    public E dequeue() {
        E response = null;
        if(!isEmpty()) {
            response = front.getData();
            front = front.getNext();
            if(front == null){
                rear = null;
            }
            size--;
        }
        return response; }

    public E peek() {
        E response = null;
        if(!isEmpty()){
            response = front.getData();
        }
        return response;
    }

    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }
    public void Traverse(){
        System.out.println("Printing elements");
        System.out.println("Front <----");
        Node<E> temp = front;
        while(temp!=null){
            System.out.println(temp.getData()+"<----");
            temp = temp.getNext();
        }
        System.out.println("Rear");
    }
}
class QueueNode<E> {
    private E data;
    private Node<E> next;

    public QueueNode(E data) {
        this.data = data;
        next = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

}
class Main {
    public static void main(String[] args) {
        Experiment8<String> queue = new Experiment8<>();
        queue.enqueue("hello");
        queue.enqueue("world");
        queue.enqueue("generic queue");
        queue.Traverse();
        String deleted = queue.dequeue();
        if(deleted!=null){
            System.out.println("delete element is : "+deleted);
        }
        else{
            System.out.println("Queue underflow");
        }
        queue.Traverse();
    }
}