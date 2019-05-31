package binarytree;

public class Node<K extends Comparable<K>, V> {
    private K key;
    private V value;
    private Node<K, V> leftChild;
    private Node<K, V> rightChild;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Node<K, V> getLeftChild() {
        return leftChild;
    }

    public Node<K, V> getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node<K, V> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(Node<K, V> rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", value: " + value + ", left child: " + leftChild + ", right child: " + rightChild + "\n";
    }
}
