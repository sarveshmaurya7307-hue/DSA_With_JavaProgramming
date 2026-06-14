package sorting;
import java.util.Arrays;
public class builtInSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,7,-4};
        for(int ele : arr){     // for which loop
            System.out.print(ele+" ");

        }
        System.out.println();
        Arrays.sort(arr);    // built In Sort Arrays
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
