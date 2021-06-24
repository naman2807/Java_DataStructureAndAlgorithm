package practical;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment7<E> {
    private int front;
    private int rear;
    private int capacity;
    private E[] queue;

    public Experiment7(int c) {
        this.front = 0;
        this.rear = 0;
        this.capacity = c;
        this.queue = (E[]) new Object[capacity];
    }

    public void queueEnqueue(E data){
if(capacity == rear){
    System.out.println("Queue is full.");
    return;
}else {
    queue[rear] = data;
}
    }
}
