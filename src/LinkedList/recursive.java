package LinkedList;

public class recursive {
    public static void print(Node head) {
        Node temp = head;  //  head node
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
    public static void displayRecursive(Node head){
        if(head==null) return; // base case

        System.out.println(head.val);
        displayRecursive(head.next);
        System.out.println(head.val); // reverse print

        }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        a.next=b;  // 10->20
        b.next=c;  // 10->20->30
        displayRecursive(a);
    }
}
