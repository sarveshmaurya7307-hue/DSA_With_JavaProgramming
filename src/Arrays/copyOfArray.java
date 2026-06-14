package Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr = {30, 10, 34, 455, 67, 24};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();
//        int[] nums = arr;   // shallow copy
//        nums[0]=70;
//        for (int ele : nums) {
//            System.out.print(ele + " ");

        // deep copy  yah such me new array banta hai
//            int[] brr = Arrays.copyOf(arr,arr.length);
//            brr[0]=70;
//            System.out.println(arr[0]);


            int[] crr = new int [arr.length];
            for(int i=0; i<arr.length; i++){
                crr[i]=arr[i];
        }
            // deep copy
            crr[0]=100;
        System.out.println(arr[0]);
    }
}