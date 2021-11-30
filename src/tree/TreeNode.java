package tree;

import com.sun.source.tree.Tree;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: tree
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 30-11-2021
 */

public class TreeNode<T> {
    private TreeNode<T> previous;
    private TreeNode<T> next;
    private T data;

    public TreeNode(TreeNode<T> previous, TreeNode<T> next, T data) {
        this.previous = previous;
        this.next = next;
        this.data = data;
    }

    public TreeNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(TreeNode<T> previous) {
        this.previous = previous;
    }

    public TreeNode<T> getNext() {
        return next;
    }

    public void setNext(TreeNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
