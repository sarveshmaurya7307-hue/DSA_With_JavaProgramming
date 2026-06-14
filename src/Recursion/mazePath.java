package Recursion;

import java.util.Scanner;

public class mazePath {

//    public static int path(int row, int  col, int m,int n){
//        if(row==m || col==n) return 1; // base case
//        // aur bhi tarike hai base case likhane ka
////        if(row==m || col==n) return 1;
////        if(row>m || col>n) return 0;
//
//        // function call
//        int rigthWays= path(row,col +1, m,n);
//        int downWays= path(row +1, col,m,n);
//        return rigthWays + downWays;
//    }
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter no: ");
//        int m= sc.nextInt();
//        System.out.print("Enter no: ");
//        int n= sc.nextInt();
//        System.out.println(path(1,1,m,n));
//
        // method 2
public static int path2(int m,int n){
    if(m==1 || n==1) return 1;
    int rigthWays= path2(m,n-1);
    int downWays= path2(m-1,n);
    return rigthWays + downWays;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no: ");
        int m= sc.nextInt();
        System.out.print("Enter no: ");
        int n= sc.nextInt();
        System.out.println(path2(m,n));

    }
}
