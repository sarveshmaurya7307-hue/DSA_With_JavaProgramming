package Conditional;
import java.util.Scanner;
public class fiveOrthree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number: ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0) System.out.println("divisible by 5 or 3 ");
        else System.out.println("divisible by not 5 or 3 ");

    }
}
