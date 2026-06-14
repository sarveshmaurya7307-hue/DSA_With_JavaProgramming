package Recursion;

import java.util.ArrayList;

public class subsets {
    static ArrayList<String> arr= new ArrayList<>();  // global
    public static void printSubset(int i, String s, String ans){
       if(i==s.length()){
           arr.add(ans);
          // System.out.println(ans);
           return;
       }
        char ch = s.charAt(i);
        printSubset(i+1,s,ans);  // not take
        printSubset(i+1,s,ans+ch);  //  take
    }

    public static void main(String[] args) {
        String s = "abcd";
        arr = new ArrayList<>();  // reset
        printSubset(0,s,"");
        System.out.println(arr);

    }
}
