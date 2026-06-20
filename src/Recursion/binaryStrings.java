package Recursion;

import java.util.Scanner;

public class binaryStrings {   //  without consecutive 1's
    public static void printbinaryString(String s, int n){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            printbinaryString(s+0,n);
            printbinaryString(s+1,n);
        }
        else printbinaryString(s+0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int n = sc.nextInt();
         printbinaryString("",n);
    }
}
