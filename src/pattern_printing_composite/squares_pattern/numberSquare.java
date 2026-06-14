package pattern_printing_composite.squares_pattern;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <= n; j++) {  // cols
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        for (int i = 1; i <= n; i++) {  // rows
//            for (int j = 1; j <= n; j++) {  // cols
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
    }
}
