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

class Solution1 {
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


// 268. Missing Number
//Example 1:
//
//Input: arr = [3,0,1]
//
//Output: 2

class Solution2 {
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i || arr[i]==n)  i++;
            else {
                swap(i,arr[i],arr);
            }
        }
        for(int k=0;k<n;k++){
            if(arr[k]!=k) return k;
        }
        return i;

    }

}


//287. Find the Duplicate Number
//Example 1:
//
//Input: arr = [1,3,4,2,2]
//Output: 2

class Solution3 {
    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
    public int findDuplicate(int[] arr) {
        while(true){
            int ele=arr[0];
            if(arr[ele]==ele) return ele;
            swap(0,ele,arr);
        }

    }
}

//645. Set Mismatch
//Example 1:
//
//Input: arr = [1,2,2,4]
//Output: [2,3]

class Solution4 {
    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
        int i=0;
        while(i<n){
            int ele=arr[i]-1;
            if(arr[i]!=arr[ele])swap(i,ele,arr);
            else i++;
        }
        for(i=0;i<n;i++){
            if(arr[i]!=i+1) return new int[] {arr[i],i+1} ;
        }
        return new int[] {arr[i],i+1} ;

    }
}

//442. Find All Duplicates in an Array
//Example 1:
//
//Input: arr = [4,3,2,7,8,2,3,1]
//Output: [2,3]

//class Solution {
//    public void swap(int i, int j, int[] arr){
//        int temp = arr[i];
//        arr[i]= arr[j];
//        arr[j]=temp;
//    }
//    public List<Integer> findDuplicates(int[] arr) {
//        int n= arr.length;
//        int i=0;
//        while(i<n){
//            int ele=arr[i]-1;
//            if(arr[i]!=arr[ele]){
//                swap(i,ele,arr);
//            }
//            else i++;
//        }
//        List<Integer> ans= new ArrayList<>();
//        for(i=0; i<n; i++){
//            if(arr[i]!=i+1) ans.add(arr[i]);
//        }
//        return ans;
//
//
//    }
//}


//448. Find All Numbers Disappeared in an Array
//Example 1:
//
//Input: arr = [4,3,2,7,8,2,3,1]
//Output: [5,6]

//class Solution {
//    public void swap(int i,int j,int[] arr){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//
//    public List<Integer> findDisappearedNumbers(int[] arr) {
//        int n = arr.length;
//        int i=0;
//        while(i<n){
//            int ele=arr[i];
//            if(arr[i]==i+1 || arr[i]==arr[ele-1])  i++;
//            else {
//                swap(i,ele-1,arr);
//            }
//        }
//        List<Integer> ans= new ArrayList<>();
//        for(int k=0;k<n;k++){
//            if(arr[k]!=k+1) ans.add(k+1);
//        }
//        return ans;
//
//    }
//
//}