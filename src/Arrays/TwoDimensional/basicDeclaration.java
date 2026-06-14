package Arrays.TwoDimensional;
import java.util.Scanner;
public class basicDeclaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[3][3];
        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]= sc.nextInt();

            }
        }
        // 10 20 30
        // 40 50 60
        // 70 80 90
//        arr[0][0]=10;
//        arr[0][1]=20;
//        arr[0][2]=30;
        // output of 2D Array
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();

        }

//        System.out.print(arr[0][1]);
    }
}
