package Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {3,-1,8,5,4,9,2};
        int x = 9;
        int n = arr.length;
        // solution
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }

         // second array
        int[] brr = {3,0,8,5,4,9,2};
        int y = 9;
        int m = brr.length;
        // solution
        for(int i=0; i<m; i++){
            for(int j=i+1; j<m;j++){
                if(brr[i]+brr[j]==x){
                    System.out.println(brr[i]+" "+brr[j]);
                }
            }
        }
    }
}
