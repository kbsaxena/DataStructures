package runner.binary;

import impl.tree.binary.*;
import questions.tree.binary.*;

public class BinaryTreeRunner {
    public static void main(String[] args) {
        BinaryTreeImpl<Integer> binaryTree = generateBT();
        BinaryTreeQuestions<Integer> utility = new BinaryTreeQuestions<>();

        System.out.println("In Order");
        utility.inOrderRecursion(binaryTree.getRoot());

        System.out.println();
        System.out.println("Pre Order");
        utility.preOrderRecursion(binaryTree.getRoot());

        System.out.println();
        System.out.println("Post Order");
        utility.postOrderRecursion(binaryTree.getRoot());
    }

    static BinaryTreeImpl generateBT(){
        BinaryTreeImpl<Integer> binaryTree = new BinaryTreeImpl<>(4);
        binaryTree.getRoot().setLeft(new Node<>(2));
        binaryTree.getRoot().setRight(new Node<>(5));

        binaryTree.getRoot().getLeft().setLeft(new Node<>(1));
        binaryTree.getRoot().getLeft().setRight(new Node<>(3));

        return binaryTree;

        /* Tree Representation
              4
             / \
            2   5
           / \
          1   3                 */
    }
}
