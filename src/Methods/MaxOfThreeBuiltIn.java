package Methods;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class MaxOfThreeBuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no.:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
