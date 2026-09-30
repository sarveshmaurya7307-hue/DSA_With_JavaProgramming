package Trees;
public class SumOfTreeNode {
    private static void dispaly(Node root){
        if(root==null) return ; // base case

        System.out.print(root.val+" ");  // self
        dispaly(root.left);  // left subtree
        dispaly(root.right); // right subtree
    }

    private static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }

    private static int product(Node root){
        if(root==null || root.val==0) return 1;
        return root.val*product(root.left)*product(root.right);
    }

    private static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a= root.val, b=max(root.left), c=max(root.right);
        return Math.max(a,Math.max(b,c));
    }

    private static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    private static int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }

    public static void main(String[] args) {
        Node a= new Node(1); // a is root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(0);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

        dispaly(a);

        System.out.println(sum(a));

        System.out.println(product(a));

        System.out.println(max(a));

        System.out.println(size(a));

        System.out.println(level(a));


    }
}
