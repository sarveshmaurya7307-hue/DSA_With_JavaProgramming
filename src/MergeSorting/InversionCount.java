package MergeSorting;

public class InversionCount {
    static int count=0;
    public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
    // first method to find count
//    public static void inversion(int[] a, int[] b){
//        int i=0, j=0;
//        while(i<a.length && j<b.length){
//            if(a[i]>b[j]){
//                count +=(a.length-i);
//                j++;
//            }
//            else i++;
//        }
//
//    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) {
                c[k++] = a[i++];
            }
            else {
                count+=(a.length-i);  // for calculating inversion to add this line this second methods
                c[k++]=b[j++];
            }
        }
        while(j<b.length) c[k++]=b[j++];
        while(i<a.length) c[k++]=a[i++];
    }
    public static void mergesort(int[]arr){
        int n =arr.length;
        if(n==1) return;  // base case

        // create two arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        // copy pasting
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }
        // mergesort karna hai ab
        mergesort(a);
        mergesort(b);
//        // find inversion count
//        inversion(a,b);
        // merge these 'a' and 'b'
        merge(a,b,arr);
        // delete of a & b
        a=null; b=null;

    }
    public static void main(String[] args) {
        int[] arr = {80,10,70,30,60,40,50,20};
        print(arr);
        mergesort(arr);
        print(arr);
        System.out.println(count);

    }
}
