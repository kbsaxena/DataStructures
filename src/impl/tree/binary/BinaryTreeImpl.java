package impl.tree.binary;

public class BinaryTreeImpl<T> {
    private Node<T> root;

    public BinaryTreeImpl(T key){
        root = new Node<>(key);
    }
    public BinaryTreeImpl(){
        root = null;
    }


    public void addNode(Node<T> parent, Node<T> child, boolean isLeft){
        if(isLeft){
            parent.setLeft(child);
        } else {
            parent.setRight(child);
        }
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
}