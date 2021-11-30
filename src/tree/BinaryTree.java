package tree;

import com.sun.source.tree.Tree;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: tree
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 30-11-2021
 */

public class BinaryTree<T> {
    private TreeNode<T> root;

    // Brute Force Method
    public void createBinaryTree(){
        TreeNode<Integer> root1;
        TreeNode<Integer> first = new TreeNode<Integer>(null, null, 1);
        TreeNode<Integer> second = new TreeNode<Integer>(null, null, 2);
        TreeNode<Integer> third = new TreeNode<Integer>(null, null, 3);
        TreeNode<Integer> fourth = new TreeNode<Integer>(null, null, 4);
        TreeNode<Integer> fifth = new TreeNode<Integer>(null, null, 5);
        TreeNode<Integer> sixth = new TreeNode<Integer>(null, null, 6);
        TreeNode<Integer> seventh = new TreeNode<Integer>(null, null, 7);
        TreeNode<Integer> eighth = new TreeNode<Integer>(null, null, 8);
        root1 = first;
    }

    public void preOrder(TreeNode<T> root){
        if (root == null){
            return;
        }

        System.out.print(root.getData() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
}
