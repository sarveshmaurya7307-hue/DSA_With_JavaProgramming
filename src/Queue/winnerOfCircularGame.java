package Queue;

import java.util.*;

public class winnerOfCircularGame {
    public int findTheWinner(int n, int k){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            q.add(i);
        }
        while(q.size()>1) {
            // k-1 element remove and add
            for (int i = 0; i < k - 1; i++) {
                q.add(q.remove());
            }
            q.remove();  // kth will be removed
        }
        return q.peek();


    }
}
