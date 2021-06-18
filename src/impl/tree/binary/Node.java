package impl.tree.binary;

public class Node<T> {
    T key;
    Node<T> left,right;

    public Node(T key){
        this.key = key;
        left = right = null;
    }
}
