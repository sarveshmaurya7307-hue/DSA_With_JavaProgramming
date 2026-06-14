package loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

//         1,3,5,7,....
//         method 1-
//
//        for(int i=1; i<=2*n-1; i+=2) {
//            System.out.println(i);
//        }


      //   1,3,5,7,....
      //   method 2-

        int a = 1, d = 2;
        for(int i=1; i<=n; i++) {
            System.out.println(a);
            a += d ;
        }





    }
}
