package Conditional;
import java.util.Scanner;
public class greatestOfthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number: ");
        int a = sc.nextInt();
        System.out.println(" Enter number: ");
        int b = sc.nextInt();
        System.out.println(" Enter number: ");
        int c = sc.nextInt();

        if(a>=b && a>=c) System.out.println(a+" is greatest ");
        else if( b>=a && b>=c)System.out.println(b+"  is greatest ");
        else System.out.println(c+" is greatest ");

    }
}
