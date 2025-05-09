import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallElement {
    static int findSmallest(int[] arr, int k) {
        // Here, we've to make it max heap to find the kth smallest element.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (pq.peek() > arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 15, 10, 40, 30, 50, 80, 90 };
        int k = 5;

        System.out.print("The kth smallest element is: " + findSmallest(arr, k));
    }
}
