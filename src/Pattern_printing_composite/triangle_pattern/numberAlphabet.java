package Pattern_printing_composite.triangle_pattern;

import java.util.Scanner;

public class numberAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <= i; j++) {
                if(i%2==0) System.out.print((char)(j+64)+" ");
                if(i%2!=0) System.out.print((j)+ " ");

            }
            System.out.println();
        }
    }
}
