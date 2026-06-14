package Arrays;

public class maxvalueofArray {
    public static void main(String[] args) {
        int[] arr = {20,10,45,67,-89,32,23,24,-56,78};
        int n = arr.length;
        // method 1->
//        int max = arr[0];
//        for (int i=1; i<n; i++){
//            if(arr[i]>max) max=arr[i];
//        }
//        System.out.println(max);


        // method 2->
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            if(arr[i]>max) max=arr[i];
           // max = Math.max(max,arr[i]);

        }
        // second largest value
        int smax = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            // if(arr[i]>smax && arr[i] != max) smax= arr[i];
            if (arr[i] != max)
                smax = Math.max(smax,arr[i]);
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
