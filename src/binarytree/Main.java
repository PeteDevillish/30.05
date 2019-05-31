package binarytree;

public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        bst.add(7, "text7");
        bst.add(5, "ddd");
        bst.add(1, "ddd");
//        bst.add(1000, "ddd");

        System.out.println(bst);
    }
}
