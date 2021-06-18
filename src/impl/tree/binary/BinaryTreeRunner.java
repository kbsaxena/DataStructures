package impl.tree.binary;

public class BinaryTreeRunner {
    public static void main(String[] args) {
        BinaryTreeImpl<Integer> binaryTree = generateBT();
        binaryTree.printTree(binaryTree.root);
    }

    static BinaryTreeImpl generateBT(){
        BinaryTreeImpl<Integer> binaryTree = new BinaryTreeImpl<>(1);
        binaryTree.addNode(binaryTree.root, new Node<>(2), true);
        binaryTree.addNode(binaryTree.root, new Node<>(3), false);
        return binaryTree;
    }
}
