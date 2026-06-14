package Arrays.TwoDimensional;

public class addTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        int[][] b = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
        int m = a.length;
        int n = b.length;
        int[][] c = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];

            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");

            }
            System.out.println();

        }
    }
}
