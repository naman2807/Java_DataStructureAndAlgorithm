package practical;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment7<E> {
    private final int front;
    private int rear;
    private final int capacity;
    private final E[] queue;

    public Experiment7(int c) {
        this.front = 0;
        this.rear = 0;
        this.capacity = c;
        this.queue = (E[]) new Object[capacity];
    }

    public void queueEnqueue(E data) {
        if (capacity == rear) {
            System.out.println("Queue is full.");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    public void queueDeque(){
        if(front == rear){
            System.out.println("Empty Queue.");
            return;
        }else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if(rear < capacity){
                queue[rear] = null;
                rear--;
            }
        }
    }

    public void queueDisplay(){
        int i;
        if(front == rear){
            System.out.println("Empty");
        }
    }
}
