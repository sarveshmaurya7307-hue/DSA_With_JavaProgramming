package pattern_printing_composite;

import java.util.Scanner;

public class compositPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <=n-i; j++) {  // cols
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=i; j++) {  // cols
                System.out.print(j + " ");
            }
            System.out.println();
        }


        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <=n-i; j++) {  // cols
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=i; j++) {  // cols
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <=n-i; j++) {  // cols
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=i; j++) {  // cols
                System.out.print((char) (j+64) + " ");
            }
            System.out.println();
        }


        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <=n-i; j++) {  // cols
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=i; j++) {  // cols
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }
    }
}
