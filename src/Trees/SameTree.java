package Trees;

public class SameTree {
        public boolean isSameTree(Node p, Node q) {

            // Dono null hain
            if (p == null && q == null) {
                return true;
            }

            // Ek null hai aur dusra nahi
            if (p == null || q == null) {
                return false;
            }

            // Values different hain
            if (p.val != q.val) {
                return false;
            }

            // Left aur right subtree compare karo
            return isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right);
        }

}
