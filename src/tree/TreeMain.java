package tree;

/**
 * Created By: Naman Agarwal
 * User ID: naman2807
 * Package Name: tree
 * Project Name: Java_DataStructureAndAlgorithm
 * Date: 30-11-2021
 */

public class TreeMain {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.createBinaryTree();
        binaryTree.preOrderByRecursion(binaryTree.getRoot1());
        System.out.println();
        binaryTree.preOrderByIteration(binaryTree.getRoot1());
    }
}
