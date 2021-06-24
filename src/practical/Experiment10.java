package practical;

import java.util.Stack;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment10 {
    Stack st = new Stack();
    private int size;
    private Node head;
    public Experiment10(){
        head = null;
        size = 0;
    }

    public void addLast(int k) {
        Node node = new Node(k);
        if(head!=null){
            Node temp = head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
            node.setNext(null);
            size++;
        }
        else{
            head = node;
            node.setNext(null);
        }
    }
    public void removeGivenNode(int k) {
        Node node = new Node(k);
        if(!isEmpty()){
            Node temp = head;
            while(temp.getNext()!=null){
                if(temp.getNext().getData()==k){
                    break;
                }
                temp = temp.getNext();
            }
            if(temp==head){
                head = head.getNext();
                size--;
            }
            else{
                temp.setNext(temp.getNext().getNext());
                size--;
            }
        }
    }

    public int size() {
        int response = 0;
        if(!isEmpty()){
            Node temp = head;
            while(temp!=null){
                response++;
                temp = temp.getNext();
            }
        }
        return response;
    }

    private boolean isEmpty() {
        return head==null;
    }

    public boolean searchGivenNode(int k) {
        boolean flag = false;
        if(!isEmpty()){
            Node temp = head;
            while(temp!=null){
                if(temp.getData()==k){
                    flag = true;
                    break;
                }
                temp = temp.getNext();
            }
            if(flag){
                removeGivenNode(k);
            }
            else{
                addLast(k);
            }
        }
        return flag; }
    public void traverse(){
        if(!isEmpty()){
            Node temp = head;
            System.out.print("Head--->");
            while(temp!=null){
                System.out.print(temp.getData()+"--->");
                temp = temp.getNext();
            }
            System.out.println("NULL");
        }
    }
}
class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}