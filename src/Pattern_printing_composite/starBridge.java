package Pattern_printing_composite;

import java.util.Scanner;

public class starBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();

        // method 1->
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <= n + 1 - i; j++) {    // spaces loop
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2*i-1; j++) {     // star loop
                System.out.print(" " + " ");
            }
            for (int j = 1; j<=n+1-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        // method 2-

        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        n--;
        int nsp=1;
        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <= n + 1 - i; j++) {    // spaces loop
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= nsp; j++) {     // star loop
                System.out.print(" " + " ");
            }
            nsp+=2;
            for (int j = 1; j<=n+1-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}


