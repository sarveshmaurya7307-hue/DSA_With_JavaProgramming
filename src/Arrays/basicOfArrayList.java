package Arrays;

import java.util.ArrayList;  // library of arraylist

public class basicOfArrayList {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        double[] brr = {3,5,4,6,3,65,3};
//        ArrayList<Integer> arr = new ArrayList<>(6);
        // int[] arr = new int[6]
//        arr.add(0, 10);  // arr[0]=10
//        arr.add(1, 20);   // initialize
//        arr.add(2, 30);
//        arr.add(3, 40);
//        arr.add(4, 50);
//        arr.add(5, 60);
//       System.out.println(arr);
//
//       System.out.println(arr.get(0));  // arr[0]=10  yah arraylist me use karte hai get()
//
//       for (int i = 0; i <= 5; i++) {
//          System.out.print(arr.get(i) + " ");  //arr[i]
//
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.get(i) + " ");
//        }
//        System.out.println();
//        arr.set(2, 70);   // modify
//        for (int i = 0; i <= 5; i++) {
//            System.out.print(arr.get(i) + " ");
//
//        }
//        arr.add(90);  // push back
//        System.out.println();
//        System.out.println(arr.size());
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.print(arr.get(i) + " ");
//
//        }


        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 10);  // arr[0]=10
        arr.add(1, 20);   // initialize
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);
        System.out.println(arr);
        arr.set(2, 70);   // modify
        System.out.println(arr);
        arr.add(90);  // push back
      //  System.out.println(arr.size());
        System.out.println(arr);
    }
}



