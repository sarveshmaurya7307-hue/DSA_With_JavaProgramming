package LinkedList;
import java.util.*;
//class Node {
//    int val;
//    Node next;
//
//    Node(int val) {
//        this.val = val;
//    }
//}
public class inputInsert {

        public static Node insert(Node head, int x) {

            Node newNode = new Node(x);

            if (head == null) {
                return newNode;
            }

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;

            return head;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            Node head = null;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                head = insert(head, x);
            }

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

}
