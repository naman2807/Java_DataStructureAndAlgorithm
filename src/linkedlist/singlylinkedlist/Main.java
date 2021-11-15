package linkedlist.singlylinkedlist;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: linkedlist.singlylinkedlist
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 27-09-2021
 */

public class Main {
    public static void main(String[] args) {
        MySinglyLinkedList<Integer> linkedList = new MySinglyLinkedList<>();
        linkedList.addToFront(1);
        linkedList.addToFront(2);
        linkedList.addToFront(3);
        linkedList.addToFront(4);
        linkedList.addToFront(5);

        linkedList.printList();

        System.out.println();
        System.out.println("Using addToLast method:");
        linkedList.addToLast(10);
        linkedList.printList();

        System.out.println();
        System.out.println("Using removeFromFront method");
        linkedList.removeFromFront();
        linkedList.printList();

        System.out.println();
        System.out.println("Using removeFromLast method");
        linkedList.removeFromLast();
        linkedList.printList();

        System.out.println();
        System.out.println("Enter at specific position");
        linkedList.insert(linkedList.getSize() + 1, 10);
        linkedList.printList();
    }
}
