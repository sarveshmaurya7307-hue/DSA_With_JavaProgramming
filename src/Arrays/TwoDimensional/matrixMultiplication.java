package Arrays.TwoDimensional;

public class matrixMultiplication {
    public static void print(int[][] arr) {
        int m =arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] a = {{1,2,1,},{2,1,2,}};
        int[][] b = {{1,0, 7 },{2,1,4},{0,3,7}};
        if(a[0].length != b.length){
            System.out.println("Multiplication not possible");
        }
        else { // multiplication is possible
            int[][] c= new int[a.length][b[0].length];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j <c[0].length ; j++) {
                    for (int k = 0; k < b.length; k++) {
                        c[i][j] += (a[i][k] * b[k][j]);
                    }
//                    System.out.print(c[i][j]+" ");

                }
//                System.out.println();

            }
            print(a);
            print(b);
            print(c);

        }

    }
}
