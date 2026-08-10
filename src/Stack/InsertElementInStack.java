package Stack;

import java.util.Stack;

public class InsertElementInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        // insert at bottom
        Stack<Integer> st_temp = new Stack<>();
        while(st.size()>0){
          st_temp.push(st.pop());
        }
        int new_element=50;
        st.push(new_element);
        while (st_temp.size()>0){
            st.push(st_temp.pop());
        }
        System.out.println(st);

        // insert at middle

        Stack<Integer> st_temps = new Stack<>();
        int idx=2;
        while(st.size()>=idx){
          st_temps.push(st.pop());
        }
        int newElement=100;
        st.push(newElement);
        while (st_temps.size()>0){
            st.push(st_temps.pop());
        }
        System.out.println(st);
    }
}
