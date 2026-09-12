package Stack;
import java.util.*;

public class celebrityProblem {

    // M[i][j] = 1 means person i knows person j
    static boolean knows(int[][] M, int a, int b) {
        return M[a][b] == 1;
    }

    static int findCelebrity(int[][] M, int n) {
        Stack<Integer> st = new Stack<>();

        // Push all persons
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Find possible celebrity
        while (st.size() > 1) {

            int a = st.pop();
            int b = st.pop();

            if (knows(M, a, b)) {
                // a knows b, so a cannot be celebrity
                st.push(b);
            } else {
                // a does not know b, so b cannot be celebrity
                st.push(a);
            }
        }

        int candidate = st.pop();

        // Verify candidate
        for (int i = 0; i < n; i++) {

            if (i == candidate) continue;

            // Celebrity should know nobody
            // Everyone should know celebrity
            if (knows(M, candidate, i) ||
                    !knows(M, i, candidate)) {
                return -1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[][] M = {
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 0}
        };

        int n = M.length;

        int celebrity = findCelebrity(M, n);

        if (celebrity == -1) {
            System.out.println("No Celebrity Found");
        } else {
            System.out.println("Celebrity is: " + celebrity);
        }
    }
}
