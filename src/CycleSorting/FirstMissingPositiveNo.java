package CycleSorting;

public class FirstMissingPositiveNo {
    public static void swap(int i, int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr ={3,4,-1,1};
        int n = arr.length;
        // cycle sort algo
        int i=0;
        while(i<n){
            int ele = arr[i];
            if(ele<=0 || ele==i+1 || ele>n || ele==arr[ele-1]) i++;
            else {
                swap(i,ele-1,arr);
            }
        }
        for(i=0; i<n; i++){
            if(arr[i]!=i+1) {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(i+1);

    }
}

// output 2

// T.C - 0(n)
// S.C - 0(1)


// 41. First Missing Positive leetcode problem
//Example 1:
//Input: arr = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.

class Solution {
    public void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int ele = arr[i];
            if (ele <= 0 || ele == i + 1 || ele > n || ele == arr[ele - 1]) i++;
            else swap(i, ele - 1, arr);
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return i + 1;

    }
}
