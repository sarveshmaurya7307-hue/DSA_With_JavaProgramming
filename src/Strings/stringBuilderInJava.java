package Strings;

import java.util.Scanner;

public class stringBuilderInJava {
    public static void main(String[] args) {

        // taking input
        Scanner sc = new Scanner(System.in);
        StringBuilder st= new StringBuilder(sc.nextLine());


        // how to write the StringBuilder in java
        String s = "abc";
       StringBuilder sb = new StringBuilder(s);
     //  StringBuilder sc = new StringBuilder("acs");
     //   System.out.println(sc.length());
        StringBuilder x = new StringBuilder("");
        System.out.println(x.length());
        System.out.println(x.capacity());

        // function

        StringBuilder a= new StringBuilder("Sarvesh");
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.reverse());

        // use of setCharAt()
        StringBuilder c = new StringBuilder("abc");
        c.setCharAt(1,'a');
        System.out.println(c);  // aac


    }
}
