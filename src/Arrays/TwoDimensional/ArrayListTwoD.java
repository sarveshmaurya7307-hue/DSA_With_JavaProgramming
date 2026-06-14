package Arrays.TwoDimensional;

import java.util.*;

public class ArrayListTwoD {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();  // 1D arraylist
        arr.add(10);
        arr.add(20);

        List<Integer> brr = new ArrayList<>();  // 1D arraylist
        brr.add(2557);
        brr.add(200);


        List<List<Integer>> l = new ArrayList<>();  // 2D arraylist
        l.add(arr);
        l.add(brr);
          System.out.println(arr);
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {

                System.out.print(l.get(i).get(j)+" ");

            }
            System.out.print(l.get(0).get(1)+" ");

        }
        System.out.println();

    }
}

