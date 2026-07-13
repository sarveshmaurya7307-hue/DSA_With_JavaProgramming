package Pattern_printing_composite;

import java.util.Scanner;

public class numberpyramidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {  // rows
            for (int j =1; j<=n-i; j++) {  // cols  // spaces loop
                System.out.print(" " + " ");
            }
            for (int j=1; j<=i; j++) {  // cols   // star loop
                System.out.print(j + " ");
            }
            for(int j=i-1; j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
