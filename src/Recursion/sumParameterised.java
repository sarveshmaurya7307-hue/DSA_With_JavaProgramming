package Recursion;

import java.util.Scanner;

public class sumParameterised {

    // method 1 parameterised
    public static void sum(int n,int s){

        if(n==0) {
            System.out.println(s);
            return;
        }
        sum(n-1,s+n);// call and work do kar ek sath ho raha hai
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. :");
        int n = sc.nextInt();

        sum(n,0);

        // method 2 return type  ( recurrence relation)

//        public static int sum(int n){
//            if(n==1||n==0) return n;
//            return n+sum(n-1);
//        }
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println(" Enter no :");
//            int n= sc.nextInt();
//            System.out.println(sum(n));
//        }


    }
}
