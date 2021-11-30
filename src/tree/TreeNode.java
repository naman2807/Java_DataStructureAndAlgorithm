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
    private TreeNode<T> left;
    private TreeNode<T> right;
    private T data;

    public TreeNode(TreeNode<T> left, TreeNode<T> right, T data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
