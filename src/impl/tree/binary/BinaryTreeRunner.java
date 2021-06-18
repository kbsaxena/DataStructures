package impl.tree.binary;

public class BinaryTreeRunner {
    public static void main(String[] args) {
        BinaryTreeImpl<Integer> binaryTree = generateBT();
        binaryTree.printTree(binaryTree.root);
    }

    static BinaryTreeImpl generateBT(){
        BinaryTreeImpl<Integer> binaryTree = new BinaryTreeImpl<>(4);
        binaryTree.addNode(binaryTree.root, new Node<>(2), true);
        binaryTree.addNode(binaryTree.root, new Node<>(5), false);

        binaryTree.addNode(binaryTree.root.left, new Node<>(1), true);
        binaryTree.addNode(binaryTree.root.left, new Node<>(3), false);
        return binaryTree;
    }
}
