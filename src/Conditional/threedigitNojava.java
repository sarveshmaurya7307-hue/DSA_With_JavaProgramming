package Conditional;
import java.util.Scanner;
public class threedigitNojava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number: ");
        int n = sc.nextInt();

//        if(n>99 && n<1000) System.out.println("3 digit no. :");
//        else System.out.println("Not 3 digit no. :");

        if(n>9999 && n<100000) System.out.println("5 digit no. :");
        else System.out.println("Not 5 digit no. :");



    }
}
