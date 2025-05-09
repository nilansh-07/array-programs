import java.util.PriorityQueue;

public class KthLargeElement {
    static int findLargest(int[] arr, int k) {
        // Here, we are creating min heap which is a default behaviour
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            // On peeking it gives smallest element
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 15, 10, 40, 30, 50, 80, 90 };
        int k = 7;

        System.out.println(findLargest(arr, k));
    }
}
