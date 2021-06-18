package impl.tree.binary;

public class BinaryTreeImpl<T> {
    Node<T> root;

    public BinaryTreeImpl(T key){
        root = new Node<>(key);
    }

    public BinaryTreeImpl(){
        root = null;
    }

    public void printTree(Node<T> n){
        //In order
        if(n.left != null) {
            printTree(n.left);
        }
            System.out.println(n.key);
        if(n.right != null) {
            printTree(n.right);
        }
    }

    public void addNode(Node<T> parent, Node<T> child, boolean isLeft){
        if(isLeft){
            parent.left = child;
        } else {
            parent.right = child;
        }

    }
}