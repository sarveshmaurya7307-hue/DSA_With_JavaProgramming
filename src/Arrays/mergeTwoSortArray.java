//package Arrays;
//
//public class mergeTwoSortArray {
//    public static void main(String[] args) {
//        int[] a = {11,33,42,71};
//        int[] b = {26,54,69,81};
//        int m=a.length;
//        int n=b.length;
//        int[] c = new int[m+n];
//
//        int i=0,j=0,k=0;
//        // merging
//        while(i<m && j<n){
//            if(a[i]<=b[j]){
//                c[k]=a[i];
//                i++;
//            }
//            else{
//                c[k]=b[j];
//                j++;
//            }
//            k++;
//        }
//        if(i==m){
//            while(j<m){  // now take element from b only
//                c[k]=b[j];
//                j++;
//                k++;
//            }
//        }
//        if(j==n){
//            while(i<m){    // now take element from a only
//                c[k]=a[i];
//                i++;
//                k++;
//            }
//        }
//        for(int ele : c){
//            System.out.print(ele+" ");
//        }
//
//
//
//    }
//}
package Arrays;

public class mergeTwoSortArray {
    public static void main(String[] args) {

        int[] a = {11,33,42,71};
        int[] b = {26,54,69,81};

        int m = a.length;
        int n = b.length;

        int[] c = new int[m + n];

        int i = 0, j = 0, k = 0;

        // merging
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // remaining elements of b
        while (j < n) {
            c[k++] = b[j++];
        }

        // remaining elements of a
        while (i < m) {
            c[k++] = a[i++];
        }

        // print merged array
        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }
}
