package Conditional;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter cost price. ");
        int cp = sc.nextInt();
        System.out.println(" Enter selling  price. ");
        int sp = sc.nextInt();

        if(sp>cp) System.out.println("profit is "+(sp-cp));
        if(cp>sp) {
            System.out.println("loss");
            System.out.println(cp-sp);

        }
//        else System.out.println("loss");
        if(cp==sp) System.out.println("NO Profit");
    }
}
