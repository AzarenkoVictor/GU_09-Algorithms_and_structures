
public class Main {
    public static void main(String[] args) {

        BinTree RedBlackTree = new BinTree<>();

        for (int i = 1; i < 10; i++) {
            RedBlackTree.add(i);
        }

        RedBlackTree.print();

    }
}