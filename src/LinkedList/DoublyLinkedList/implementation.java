package LinkedList.DoublyLinkedList;
class DNode{
    Node head;
    Node tail;
    int size;
    void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp= temp.next;
        }
        System.out.println();
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(size==0) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(size==0) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
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
        for(int i=1; i<=idx-1; i++){
            x = x.next;
        }
        Node y=x.next;
        x.next=temp; temp.prev=x;
        y.prev=temp; temp.next=y;

        size++;
    }
    void deleteAtHead() throws Error{
        if(size==0) throw new Error("List is empty");
        head= head.next;
        head.prev= null; // extra work
        size--;
    }
    void deleteAtTail() throws Error{
        if(size==0) throw new Error("List is empty");
        tail= tail.prev;
        tail.next= null; // extra work
        size--;
    }
    void delete(int idx) throws Error{
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        if(head==null) throw new Error("List is empty");
        if(idx>=size || idx<0 ) throw new Error("invalid index");
        Node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp=temp.next;  // extra
        temp.prev=temp.prev.prev;  // extra
        size--;
    }
}
public class implementation {
    public static void main(String[] args) {
        DNode list = new DNode();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);
        list.insertAtHead(50);
        list.display();
        list.insert(2,300);
        list.display();
        list.delete(3);
        list.display();

    }
}
