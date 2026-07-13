package Conditional;
import java.util.Scanner;
public class nestedIfelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number: ");
        int a = sc.nextInt();
        System.out.println(" Enter number: ");
        int b = sc.nextInt();
        System.out.println(" Enter number: ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c) System.out.println(a+" is greatest");
            else  // c > a > b
                System.out.println(c+" is greatest");
        }
        else {  // b > a
            if(b>c) System.out.println(b+" is greatest");
            else  // c >b
                System.out.println(c+" is greatest");





        }


    }
}
