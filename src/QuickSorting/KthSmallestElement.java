package QuickSorting;

public class KthSmallestElement {
    static int ans;
    public static void swap(int[]arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int  partition(int[]arr , int lo, int hi){
        int mid =(lo+hi)/2;
        int pivot = arr[mid], pivotIdx=mid;
        int smallercount=0;
        for(int i=lo; i<=hi; i++){
            if(i==mid) continue;
            if(arr[i]<=pivot) smallercount++;
        }
        int correctIdx=lo+smallercount;
        swap(arr, pivotIdx,correctIdx);
        // partition
        int i=lo,j=hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);

            }
        }
        return correctIdx ;
    }
    public static void quickSelect(int[] arr, int lo,int hi, int k){
        if(lo>hi) return;
        if(lo==hi){
            if(lo==k-1) ans =arr[lo];
            return;
        }
        int idx= partition(arr,lo,hi);
        if(idx==k-1){
            ans=arr[idx];
            return;
        }

       if(k-1<idx) quickSelect(arr,lo,idx-1,k);
       else quickSelect(arr,idx+1,hi,k);


    }
    public static void main(String[] args) {
        int[] arr = {4,9,1,2,6,5,8};
        int n = arr.length;
        print(arr);
        int k =2;
        ans =-1;
        quickSelect(arr,0,n-1,k);  // for Kth smallest element
        System.out.println(ans);

        quickSelect(arr,0,n-1,n-k+1);  // for Kth largest element
        System.out.println(ans);


    }
}

// T.C - 0(n)  [Best,avg. case] but worst 0(n^2)
