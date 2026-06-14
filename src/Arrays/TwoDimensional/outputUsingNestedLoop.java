package Arrays.TwoDimensional;

import java.util.Scanner;
import java.util.Scanner;
public class outputUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][3];
        int m=arr.length; // no of row / lines
        int n=arr[0].length; // no of cols
        System.out.println(m);


        // input of 2D array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
            // output of 2D array
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
