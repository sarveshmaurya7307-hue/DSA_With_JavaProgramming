package BinarySearch;

public class bs {
    public static void main(String[] args) {
        int[] arr = {10,23,46,89,91,94,105,140,253};
        int target = 46;
        int n= arr.length;
        int lo=0,hi=n-1;
        boolean flag=false;
        while(lo<=hi){
            int mid =(lo+hi)/2;
            if(arr[mid] == target) {
                flag = true;
                break;
            }
           else if(arr[mid]<target) lo=mid+1;  // go right
            else if(arr[mid]>target)  hi=mid-1;  // go left
        }
        if(flag == true ) System.out.println("Target present");
        else System.out.println("Target is not present");
    }
}




// leetcode problem no. 704

class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;

        int low=0,high=n-1;

        while(low<=high)
        {

            int mid =(low+high)/2;

            if(arr[mid]==target)
                return mid;

            else if (arr[mid]<target)
                low=mid+1;

            else high=mid-1;

        }
        return -1;
    }
}
