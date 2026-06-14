//package BinarySearch;
//
//public class firstOccurrence {
//    public static void main(String[] args) {
//        int[] arr={1,1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,9,9,12};
//        int lo=0, hi=arr.length-1, idx=-1;
//        int tar=5;
//        while(lo<=hi){
//            int mid =(lo+hi)/2;
//            if(arr[mid]>tar) hi=mid-1;
//            else if(arr[mid]<tar) lo =mid+1;
//            else {
//                idx=mid;
//                hi=mid-1;
//            }
//        }
//        System.out.println(arr[tar]);
//    }
//}

// for last occurrence

//public static int lastOcc(int[] arr, int tar) {
//    int lo = 0, hi = arr.length - 1;
//    int idx = -1;
//
//    while (lo <= hi) {
//        int mid = lo + (hi - lo) / 2;   // safe mid calculation
//
//        if (arr[mid] > tar) {
//            hi = mid - 1;
//        }
//        else if (arr[mid] < tar) {
//            lo = mid + 1;
//        }
//        else {
//            idx = mid;       // store answer
//            lo=mid+ 1;    // move left to find earlier occurrence
//        }
//    }
//
//    return idx;
//}



package BinarySearch;

public class firstOccurrence {

    public static int firstOcc(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1;
        int idx = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;   // safe mid calculation

            if (arr[mid] > tar) {
                hi = mid - 1;
            }
            else if (arr[mid] < tar) {
                lo = mid + 1;
            }
            else {
                idx = mid;       // store answer
                hi = mid - 1;    // move left to find earlier occurrence
            }
        }

        return idx;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,9,9,12};
        int tar = 1;

        int result = firstOcc(arr, tar);

        if (result != -1)
            System.out.print("First Occurrence of " + tar + " is at index: " + result);
        else
            System.out.print ("Element not found");
    }
}

