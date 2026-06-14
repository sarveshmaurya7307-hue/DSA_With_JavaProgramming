package Arrays;

public class sumOfarray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9,12,34,56,64 };
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
