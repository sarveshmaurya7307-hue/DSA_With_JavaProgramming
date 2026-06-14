package pattern_printing_composite.squares_pattern;

import java.util.Scanner;

public class starRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the cols : ");
        int n = sc.nextInt();


        for(int i=1; i<=m; i++){  // rows
            for(int j=1; j<=n; j++ ){  // cols
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
