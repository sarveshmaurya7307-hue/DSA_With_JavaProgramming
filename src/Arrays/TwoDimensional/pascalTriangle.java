package Arrays.TwoDimensional;
import java.util.*;
public class pascalTriangle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numRows = sc.nextInt();

            List<List<Integer>> ans = new ArrayList<>();

            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();
                row.add(1);
                // Middle elements
                for (int j = 1; j < i; j++) {
                    row.add(ans.get(i - 1).get(j - 1)
                            + ans.get(i - 1).get(j));
                }

                // Last element
                if (i > 0) {
                    row.add(1);
                }

                ans.add(row);
            }

            // Print Pascal's Triangle
            for (List<Integer> row : ans) {
                System.out.println(row);
            }

    }
}
