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
        StackNode<E> temp = new StackNode<>(data);
        if(top == null){
            top = temp;
        }else {
            top.setNext(temp);
            top = temp;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public E peek(){
        if(!isEmpty()){
            return top.getData();
        }else {
            return null;
        }
    }

    public void pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        top = (top).getNext();
    }

    public void display(){
if(top == null){
    System.out.println("Stack is empty");
}else {
    StackNode<E> temp = top;
    while (temp != null){
        System.out.println(temp.getData());
    }
}
    }
}

class StackNode<E> {
    private final E data;
    private StackNode<E> next;

    public StackNode(E data) {
        this.data = data;
    }

    public StackNode(E data, StackNode<E> next) {
        this.data = data;
        this.next = next;
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