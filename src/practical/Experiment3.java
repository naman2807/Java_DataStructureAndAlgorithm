package practical;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment3<E> {

    public Node<E> head = null;
    private int size = 0;

    public boolean add(E item) {
        add(size, item);
        return true;
    }

    public void add(int index, E item) {
        if (index < 0 || index > size) {
            // throw the IndexOutOfBoundsException if the index given is incorrect.
            throw new IndexOutOfBoundsException(index);
        }else if (index == 0) {
            // the node is to be added at the first index, call the addFirst() method
            addFirst(item);
        } else {
            // the node is to be added somewhere after a given node
            // firstly, get the node after which we have to add a new node.
            Node<E> previousNode = getNode(index - 1);
            // call the addAfter() method to add the node after 'previousNode'.
            addAfter(previousNode, item);
        }
    }

    private void addFirst(E item) {
        head = new Node<>(item, head);
        // increase the size of the linked list
        size++;
    }

    private void addAfter(Node<E> node, E item) {

    }
}

class Node<E>{
    private final E data;
    private Node<E> next;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}