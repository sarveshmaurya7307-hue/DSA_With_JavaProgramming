package Stack;

import java.util.Stack;

public class basicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.pop();
        System.out.println(st);
        System.out.println(st.pop()); // it return the topmost ele and then remove it
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        // to access first element in stack
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st);

    }
}
