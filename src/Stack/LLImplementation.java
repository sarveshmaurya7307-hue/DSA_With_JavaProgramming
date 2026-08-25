package Stack;
class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;
    int peek(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
    }
    int pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int x=head.val;
        head=head.next;
        len--;
        return x;
    }
    int push(int ele){
        Node temp =new Node(ele);
        if(len==0)  head= temp;
        else {
            temp.next=head;
            head=temp;
        }
        len++;
        return -1;
    }
    int size(){
        return len;
    }
    void display(){// print kar hai yah display kar same
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();

    }
}
public class LLImplementation {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(50);
        st.push(69);
        st.display();
        st.pop();
        st.display();

    }
}
