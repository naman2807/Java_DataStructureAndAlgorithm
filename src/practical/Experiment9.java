package practical;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: practical
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 24-06-2021
 */

public class Experiment9<E extends Comparable<E>>{
    private Node root;//head
    private int size;
    public Experiment9() {
        root = null; size = 0;
    }
    public void insert(E data){
        Node<E> node = new Node<>(data);
        if(isEmpty()){
            root = node;
        }
        else{
            Node<E> temp = root;
            Node<E> parent = null;
            while(temp!=null){
                parent = temp;
                if(data.compareTo(temp.getData())<=0){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }
            if(data.compareTo(parent.getData())<=0){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }
        size++;
        System.out.println("Node inserted");
    }
    private boolean isEmpty() {
        return root == null;
    }
    public int getSize(){
        return size;
    }
    public void preOrder(Node<E> node){
        if(node!=null){
            System.out.println(node.getData()+" ");
            preOrder(node.getRight());
            preOrder(node.getLeft());
        }
    }
    public void inOrder(Node<E> node){
        if(node!=null){
            inOrder(node.getLeft());
            System.out.print(node.getData()+" ");
            inOrder(node.getRight());
        }
    }
    public void postOrder(Node<E> node){
        if(node!=null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getData()+" ");
        }
    }
    // complexicity for balanced binary tree is O(log(n)) and for unbalanced is O(n) for this search method
    public boolean search(E element) {
        Node<E> temp = root;
        boolean response = false;
        while (temp != null) {
            if (element.compareTo(temp.getData()) < 0) {
                temp = temp.getLeft();
            } else if (element.compareTo(temp.getData()) > 0) {
                temp = temp.getRight();
            } else {
                response = true;
                break;
            }
        }
        return response;
    }
    public void delete(E deletingElement){
        Node<E> temp = root;
        Node<E> parent = null;
        while(temp!=null){
            if(getCompare(deletingElement,temp)==0){
                break;
            }
            else{
                parent = temp;
                if(getCompare(deletingElement,temp) < 0){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }
        }
        if(temp!=null){
            // case 1 = leaf node
            if(isLeaf(temp)){
                if(parent==null){
                    root = null;
                }
                else{
                    if(getCompare(deletingElement,parent)<0){
                        parent.setLeft(null);
                    }
                    else{
                        parent.setRight(null);
                    }
                }
            }
            // case 2
            // left child
            else if(hasLeftChild(temp)){
                if(parent==null){
                    root = root.getLeft();
                }
                else{
                    if(getCompare(deletingElement,parent)<0){
                        parent.setLeft(temp.getLeft());
                    }
                    else{ parent.setRight(temp.getLeft());
                    }
                }
            }
            // Right child
            else if(hasRightChild(temp)){
                if(parent==null){
                    root = root.getRight();
                }
                else{
                    if(getCompare(deletingElement,parent)<0){
                        parent.setLeft(temp.getRight());
                    }
                    else{
                        parent.setRight(temp.getRight());
                    }
                }
            }
            // case 3
            else{
                Node<E> successor = getSuccessor(temp);
                // deleting successor
                delete(successor.getData());
                if(parent==null){
                    successor.setRight(root.getRight());
                    successor.setLeft(root.getLeft());
                    root = successor;
                }
                else{
                    if(deletingElement.compareTo(parent.getData())<0){
                        parent.setLeft(successor);
                    }
                    else{
                        parent.setRight(successor);
                    }
                }
            }
        }
        else{
            System.out.println("Can not delete");
        }
    }
    private Node<E> getSuccessor(Node<E> node){
        Node<E> response = null;
        Node<E> temp = node.getRight();
        while(temp.getLeft()!=null){
            temp = temp.getLeft();
        }
        response = temp;
        return response;
    }
    private boolean hasRightChild(Node<E> temp) {
        if(temp.getRight()!=null && temp.getLeft()==null){
            return true;
        }
        else{
            return false;
        }
    } private boolean hasLeftChild(Node<E> temp) {
        if(temp.getLeft()!=null && temp.getRight()==null){
            return true;
        }
        else{
            return false;
        }
    }
    private int getCompare(E data, Node<E> node){
        return data.compareTo(node.getData());
    }
    private boolean isLeaf(Node<E> temp){
        if(temp.getLeft()==null && temp.getRight()==null){
            return true;
        }
        else{
            return false;
        }
    }
    public E getMax(){
        Node<E> temp = root;
        while(temp.getRight()!=null){
            temp = temp.getRight();
        }
        return temp.getData();
    }
    public E getMin(){
        Node<E> temp = root;
        while(temp.getLeft()!=null){
            temp = temp.getLeft();
        }
        return temp.getData();
    }
}
class Node<E extends Comparable<E>>{
    private E data;
    private Node left;
    private Node right;
    public Node(E data) {
        this.data = data;
        left = null;
        right = null;
    }
    public E getData() {
        return data;
    }
    public void setData(E data) {
        this.data = data;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
}