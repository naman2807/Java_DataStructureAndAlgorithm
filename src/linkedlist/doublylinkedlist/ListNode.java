package linkedlist.doublylinkedlist;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: linkedlist.doublylinkedlist
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 15-11-2021
 */

public class ListNode<T> {
    private ListNode<T> next;
    private ListNode<T> previous;
    private T data;

    public ListNode(ListNode<T> next, ListNode<T> previous, T data) {
        this.next = next;
        this.previous = previous;
        this.data = data;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public ListNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode<T> previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
