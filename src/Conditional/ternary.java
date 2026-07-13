package Conditional;
import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter no. ");
        int n = sc.nextInt();

        // condition ? if true : if false
        System.out.println( (n%2==0 ) ? "even": " odd" );

    }
}
