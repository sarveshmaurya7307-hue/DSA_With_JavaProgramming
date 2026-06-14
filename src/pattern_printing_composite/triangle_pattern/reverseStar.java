package pattern_printing_composite.triangle_pattern;

import java.util.Scanner;

public class reverseStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <=n+1-i; j++) {  // cols
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
