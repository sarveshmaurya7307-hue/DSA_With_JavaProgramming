
package Queue;

import java.util.*;

public class basicSTLOfQueue {

    private static void display(Queue<Integer> q) {
        int n = q.size();

        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }

        System.out.println();
    }

    private static void addAtIndex(Queue<Integer> q, int idx, int val) {

        if (idx < 0 || idx > q.size()) {
            System.out.println("Invalid Index!");
            return;
        }

        int n = q.size();

        // Rotate first idx elements
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        // Add value
        q.add(val);

        // Restore original order
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
    }


    // Returns the element at given index without removing it
    private static int peek(Queue<Integer> q, int idx) {

        if (idx < 0 || idx >= q.size()) {
            System.out.println("Invalid Index!");
            return -1;
        }

        int n = q.size();

        // Move idx elements from front to back
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        // Element at idx is now at front
        int ans = q.peek();

        // Restore original queue order
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }

        return ans;
    }


    // Removes and returns the element at given index
    private static int remove(Queue<Integer> q, int idx) {

        if (idx < 0 || idx >= q.size()) {
            System.out.println("Invalid Index!");
            return -1;
        }

        int n = q.size();

        // Move idx elements from front to back
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        // Remove the required element
        int ans = q.remove();

        // Restore remaining elements
        for (int i = 0; i < n - idx - 1; i++) {
            q.add(q.remove());
        }

        return ans;
    }


    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        display(q);

        addAtIndex(q, 2, 60);
        display(q);

        System.out.println("Element at index 2: " + peek(q, 2));
        display(q);

        System.out.println("Removed element at index 4: " + remove(q, 4));
        display(q);
    }
}