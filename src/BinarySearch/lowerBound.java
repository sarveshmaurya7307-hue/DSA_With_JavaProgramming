package BinarySearch;

public class lowerBound {
    public static void main(String[] args) {
        // for lower bound
//        int[] arr = {10,23,46,89,91,94,105,140,253};
//        int n = arr.length;
//        int x = 50;
//        int lb=n;
//      int   lo=0, hi=n-1;
//      while(lo<=hi){
//          int mid =lo+(hi-lo)/2;
//          if(arr[mid]>=x){
//              lb=Math.min(lb,mid);
////              lb=mid;
//              hi=mid-1;
//
//          }
//          else lo=mid+1;
//      }
//        System.out.println(lb);

      // Upper bound same code but condition change

        int[] arr = {10,23,46,89,91,94,105,140,253};
        int n = arr.length;
        int x = 50;  // target
        int lb=n;
        int   lo=0, hi=n-1;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            if(arr[mid]>=x){
                lb=Math.min(lb,mid);
//              lb=mid;
                hi=mid-1;

            }
            else lo=mid+1;
        }
        System.out.println(lb);

    }
}
