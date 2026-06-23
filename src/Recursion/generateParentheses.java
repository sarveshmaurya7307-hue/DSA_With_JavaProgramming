package Recursion;

import java.util.Scanner;

public class generateParentheses {
    public static void print(int open, int close, int n, String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
       if(open<n) print(open+1,close,n,s+"(");
      if(close<open)  print(open,close+1,n,s+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter n : ");
        int n = sc.nextInt();

        print(0,0,n,"");

    }
}

//       Leetcode problem
//      22. Generate Parenthese
//       Example 1:
//
//      Input: n = 3
//      Output: ["((()))","(()())","(())()","()(())","()()()"]
//
//
//       code-
//
//class Solution {
//    static List<String> ans;
//    public void print(int open, int close, int n, String s){
//        if(s.length()==2*n){
//            ans.add(s);
//            return;
//        }
//
//        if(open<n) print(open+1,close,n,s+"(");
//        if(close<open) print(open,close+1,n,s+")");
//    }
//    public List<String> generateParenthesis(int n) {
//        ans = new ArrayList<>();
//        print(0,0,n,"");
//        return ans;
//
//
//    }
//}

