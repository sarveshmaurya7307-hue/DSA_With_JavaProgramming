package Arrays;

public class rollnumber {
    public static void main(String[] args) {
        int[] arr = {82,43,56,76,2,34,12,58};
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]<35) System.out.print(i+" ");
        }

    }
}
