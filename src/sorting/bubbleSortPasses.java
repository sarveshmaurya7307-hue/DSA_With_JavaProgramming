package sorting;

public class bubbleSortPasses {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {10,4,1,0,-2};
        int n = arr.length;
        print(arr);

        // Bubble Sort - 1
//        for(int x=1; x<=n-1; x++) {     // n-1 passes
//            for (int i = 0; i < n - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//        print(arr);

//        // Bubble Sort - 2
//        for(int x=0; x<n-1; x++) {     // n-1 passes
//            for (int i = 0; i < n - 1 - x; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//        print(arr);
        // Bubble Sort Optimised -3
        for(int x=0; x<n-1; x++) { // n-1 passes

            boolean flag = true;
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
            //check if this pass has sorted or not
            if (flag == true) break;
        }
        print(arr);

    }
}

       // leetcode problem no. 283 Move Zeros
class Solution {
    public void moveZeroes(int[] arr) {
        int noz=0;
        int n = arr.length;
        for(int ele : arr){
            if(ele==0) noz++;

        }
        for(int x=0; x<noz; x++){
            for(int i=0; i<n-1-x; i++){
                if(arr[i]==0){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}

