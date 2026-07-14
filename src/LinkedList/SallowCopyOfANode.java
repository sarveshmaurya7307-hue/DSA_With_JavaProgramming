package LinkedList;
//class Node{
//        int val;
//    Node next;
//    Node(int  val){
//        this.val=val;
//    }
//
//}
public class SallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(10);
        System.out.println(a.val);
        Node temp=a;  // shallow copy
//        Node temp =new Node(10);  // deep copy
        System.out.println(temp.val);
    }
}
