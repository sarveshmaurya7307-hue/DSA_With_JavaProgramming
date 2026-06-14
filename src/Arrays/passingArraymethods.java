package Arrays;

public class passingArraymethods {
    public static void main(String[] args) {
        int[] arr = {18, 29, 45, 57};
        System.out.println(arr[0]);

        // reference variable gets passed
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 90;
    }
}


   // dono same hai
//    int[] arr={18,29,45,57};
//        System.out.println(arr[0]);
//    change(arr);
//        System.out.println(arr[0]);
//}
//public static void change(int[] x) {
//    x[0]=90;
//}
//}
