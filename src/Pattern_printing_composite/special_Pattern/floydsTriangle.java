package Pattern_printing_composite.special_Pattern;

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();
        int a = 1;

        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= i; ++j) {
                int var10001 = a++;
                System.out.print(var10001 + " ");
            }

            System.out.println();
        }

    }
}
