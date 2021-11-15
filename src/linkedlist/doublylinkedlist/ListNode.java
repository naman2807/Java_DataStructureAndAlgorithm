package linkedlist.doublylinkedlist;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: linkedlist.doublylinkedlist
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 15-11-2021
 */

public class ListNode<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    private T data;

    public ListNode(ListNode<T> head, ListNode<T> tail, T data) {
        this.head = head;
        this.tail = tail;
        this.data = data;
    }

    public ListNode<T> getHead() {
        return head;
    }

    public void setHead(ListNode<T> head) {
        this.head = head;
    }

    public ListNode<T> getTail() {
        return tail;
    }

    public void setTail(ListNode<T> tail) {
        this.tail = tail;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
