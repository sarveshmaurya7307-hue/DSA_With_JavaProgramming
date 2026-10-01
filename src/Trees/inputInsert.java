package Trees;
import java.util.*;
//    class Node {
//        int val;
//        Node left;
//        Node right;
//
//        Node(int val) {
//            this.val = val;
//        }
//    }
public class inputInsert {

        public static Node insert(Node root, int x) {

            if (root == null) {
                return new Node(x);
            }

            if (x < root.val) {
                root.left = insert(root.left, x);
            } else {
                root.right = insert(root.right, x);
            }

            return root;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            Node root = null;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                root = insert(root, x);
            }
        }

}
