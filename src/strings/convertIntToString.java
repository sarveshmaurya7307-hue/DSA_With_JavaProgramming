package strings;

import java.util.Scanner;

public class convertIntToString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
//        String s =" "+n;
        String s = " ";
        s+=n;
        System.out.println(s);
        System.out.println(s.length());  // give the length


        int m = sc.nextInt();
//        String a = " "+m;
        String a = Integer.toString(m);
        System.out.println(a);
        System.out.println(a.length());  // give the length


    }
}
