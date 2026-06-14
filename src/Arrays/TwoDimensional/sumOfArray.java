package Arrays.TwoDimensional;

public class sumOfArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{6,7,8}};
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        int sum=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                mx=Math.max(mx,arr[i][j]);
                sum += arr[i][j];

            }

            System.out.println("Max is :" + mx);
            System.out.println(sum+" ");

        }
    }
}
