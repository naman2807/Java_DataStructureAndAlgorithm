package tree;

import stack.MyStack;

import java.util.LinkedList;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: tree
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 30-11-2021
 */

public class BinaryTree<T extends Comparable<T>>{
    private TreeNode<T> root;

    private TreeNode<Integer> root1;

    public BinaryTree() {
        this.root = null;
    }

    /*
    First, we have to find the place where we want to add a new node in order to keep the tree sorted. We'll
    follow these rules starting from the root node:

    1. if the new node's value is lower than the current node's, we go to the left child
    2. if the new node's value is greater than the current node's, we go to the right child
    3. when the current node is null, we've reached a leaf node and we can insert the new node in that position
     */
    public void add(T value) {
        root = addRecursive(root, value);
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public TreeNode<Integer> getRoot1() {
        return root1;
    }

    private TreeNode<T> addRecursive(TreeNode<T> current, T value) {
        if (current == null) {
            return new TreeNode<>(null, null, value);
        }

        if (current.getData().compareTo(value) > 0) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (current.getData().compareTo(value) < 0) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {
            // value already exists
            return current;
        }
        return current;
    }

    // Brute Force Method
    public void createBinaryTree() {
        TreeNode<Integer> first = new TreeNode<Integer>(null, null, 1);
        TreeNode<Integer> second = new TreeNode<Integer>(null, null, 2);
        TreeNode<Integer> third = new TreeNode<Integer>(null, null, 3);
        TreeNode<Integer> fourth = new TreeNode<Integer>(null, null, 4);
        TreeNode<Integer> fifth = new TreeNode<Integer>(null, null, 5);
        TreeNode<Integer> sixth = new TreeNode<Integer>(null, null, 6);
        TreeNode<Integer> seventh = new TreeNode<Integer>(null, null, 7);
        TreeNode<Integer> eighth = new TreeNode<Integer>(null, null, 8);
        root1 = first;
        first.setLeft(second);
        first.setRight(third);
        second.setLeft(fourth);
        second.setRight(fifth);
        third.setLeft(sixth);
        third.setRight(seventh);
    }

    // Recursive Method
    public void preOrderByRecursion(TreeNode<T> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getData() + " ");
        preOrderByRecursion(root.getLeft());
        preOrderByRecursion(root.getRight());
    }

    // Iterative Method
    public void preOrderByIteration(TreeNode<T> root){
        if (root == null){
            return;
        }

        MyStack<TreeNode<T>> stack = new MyStack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode<T> temp = stack.pop();
            System.out.print(temp.getData() + " ");
            if (temp.getRight() != null) stack.push(temp.getRight());
            if (temp.getLeft() != null) stack.push(temp.getLeft());
        }
    }
}
