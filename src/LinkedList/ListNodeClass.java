package LinkedList;

// node class with parameterised constructor
class Node{
   int val;
   Node next;
   Node(int  val){
       this.val=val;
   }

}

public class ListNodeClass {
    public static void print(Node head){
        Node temp = head;  //  head node
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
//        System.out.println(a);  // address print hoga
//        System.out.println(a.val);// value print hoga
//        System.out.println(a.next);  // Null
        a.next=b;  // 10->20
        b.next=c;  // 10->20->30
//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);


//        Node temp = a;  //  head node
////        for(int i=1; i<=3; i++){
//        while(temp!=null){
//            System.out.println(temp.val);
//            temp=temp.next;
//        }

        print(a);




    }

}
