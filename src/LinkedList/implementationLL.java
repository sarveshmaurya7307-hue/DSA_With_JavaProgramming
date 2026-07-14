package LinkedList;
class SLL{   // singly linkedList  user defined data structure
    Node head;
    Node tail;
    int size;
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;

        }
        size++;
    }

    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead() throws Error{
        if(head==null) throw new Error("List is empty");
        head= head.next;
        size--;
    }

    void delete(int idx) throws Error{
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(head==null) throw new Error("List is empty");
        if(idx>=size || idx<0 ) throw new Error("invalid index");
        Node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp=temp.next;
        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }

    void insert(int idx, int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid Index !!");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1; i<=idx; i++){
            x = x.next;
        }
        // Insertion
        temp.next = x.next;
        x.next = temp;

        size++;
    }

    int get(int idx) throws Error {
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0) {
            throw new Error("Invalid Error");
        }
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    void set(int idx, int val) throws Error {
        if(idx==size-1){
            tail.val= val;
        }
        if(idx>=size || idx<0) {
            throw new Error("Invalid Error");
        }
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        temp.val= val;
    }

    void display(){     // T.C - o(n)
        Node temp = head;  //  head node
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size(){
        System.out.println("size:" + size);
    }
}
public class implementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display();

        list.size();

        list.insertAtTail(60);   //  T.C & S.C - o(1) if tail is not given than T.C become o(n)
        list.display();

        list.insertAtHead(70);   //  T.C & S.C - o(1)
        list.display();

        list.insert(4,90);   // T.C - o(n)
        list.display();
        list.insert(-1,90);   // T.C - o(n)
        list.display();

        System.out.println(list.get(3));   // T.C - o(n)  in array t.c o(1)
       // System.out.println(list.get(-1));

      list.set(2,100);    // T.C - o(n)  in array t.c o(1)
      list.display();
      list.deleteAtHead();
      list.display();
      list.size();
      list.delete(3);
      list.display();
      list.size();


    }
}
