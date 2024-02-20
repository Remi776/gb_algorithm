package red_black_tree;

public class Test {

    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();

        for (int i = 1; i <= 15; i++) {
            tree.insert(i);
        }

        RedBlackTreePrinter printer = new RedBlackTreePrinter();
        printer.printTree(tree.getRoot());
    }
}
