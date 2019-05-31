package binarytree;

public class BST<K extends Comparable<K>, V> {
    private Node<K, V> root;

    public BST() {
    }

    public BST(Node<K, V> root) {
        this.root = root;
    }

    public Node<K, V> getRoot() {
        return root;
    }

    public void add(K key, V value) {
        if (root == null)
            root = new Node<>(key, value);
        else {
            isBiggerThanKeyOfParent(key, value, root);
        }
    }

    private void isBiggerThanKeyOfParent(K key, V value, Node<K, V> node) {
        if (key.compareTo(node.getKey()) > 0) {
            if (node.getRightChild() == null) {
                node.setRightChild(new Node<>(key, value));
            } else {
                isBiggerThanKeyOfParent(key, value, node.getRightChild());
            }

        } else {
            if (node.getLeftChild() == null) {
                node.setLeftChild(new Node<>(key, value));
            } else {
                isBiggerThanKeyOfParent(key, value, node.getLeftChild());
            }

        }
    }

    @Override
    public String toString() {
        return "Root: " + root;
    }
}
