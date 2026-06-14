package loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        // for GP -> 1,2,4,6,8,....
//        int a = 1;
//        for(int i=1; i<=n; i++){
//            System.out.println(a);
//            a *=2;
//        }

        // homework
        // 3,12,48,...
        int a = 3;
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a *=4;
        }
    }
}
