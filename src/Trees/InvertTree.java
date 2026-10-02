package Trees;

public class InvertTree {
        public Node invertTree(Node root) {

            // Tree empty hai
            if (root == null) {
                return null;
            }

            // Left aur right ko swap karo
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            // Left subtree invert karo
            invertTree(root.left);

            // Right subtree invert karo
            invertTree(root.right);

            return root;
        }

}
