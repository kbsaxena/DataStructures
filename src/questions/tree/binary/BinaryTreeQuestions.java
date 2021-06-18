package questions.tree.binary;

import impl.tree.binary.*;

public class BinaryTreeQuestions<T> {

    public void inOrderRecursion(Node<T> n){
        if(n == null) {
            return;
        }

        inOrderRecursion(n.getLeft());
        System.out.print(n.getKey());
        inOrderRecursion(n.getRight());
    }

    public void preOrderRecursion(Node<T> n){
        if(n == null) {
            return;
        }

        System.out.print(n.getKey());
        preOrderRecursion(n.getLeft());
        preOrderRecursion(n.getRight());
    }

    public void postOrderRecursion(Node<T> n){
        if(n == null) {
            return;
        }

        postOrderRecursion(n.getLeft());
        postOrderRecursion(n.getRight());
        System.out.print(n.getKey());
    }
}
