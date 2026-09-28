package Trees;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class NodeOfTRee {
    public static void main(String[] args) {
        Node a= new Node(1); // a is root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;

//        System.out.println(b.val);
//        System.out.println(a.left.val);
//        System.out.println(e.val);
//        System.out.println(a.left.right.val);
        dispaly(a);
    }
    private static void dispaly(Node root){
        if(root==null) return ; // base case

        System.out.print(root.val+" ");  // self
        dispaly(root.left);  // left subtree
        dispaly(root.right); // right subtree
    }

}
