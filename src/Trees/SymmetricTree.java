package Trees;

public class SymmetricTree {
        public boolean isSymmetric(Node root) {
            return mirror(root.left, root.right);
        }

        private boolean mirror(Node left, Node right) {

            // Both nodes are null
            if (left == null && right == null) {
                return true;
            }
            // One node is null
            if (left == null || right == null) {
                return false;
            }
            // Values are different
            if (left.val != right.val) {
                return false;
            }
            // Mirror comparison
            return mirror(left.left, right.right)
                    && mirror(left.right, right.left);
        }

}
