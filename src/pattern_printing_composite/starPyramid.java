package pattern_printing_composite;

import java.util.Scanner;

public class starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();

         // method 1-
        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <=n-i; j++) {  // cols  // spaces loop
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=2*i-1; j++) {  // cols   // star loop
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // method 2- Extra variable
        int nsp=n-1;  // number of spaces
        int nst=1;   // number of star
        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <=nsp; j++) {  // cols  // spaces loop
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=nst; j++) {  // cols   // star loop
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
