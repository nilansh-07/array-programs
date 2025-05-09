import java.util.HashMap;

public class CountPair {
    static int countPair(int[] arr, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int result = 0;

        for (int num : arr) {
            if (num > k) {
                continue;
            }

            int secondVal = k - num;
            result += freqMap.getOrDefault(secondVal, 0);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 1 };
        int k = 6;
        System.out.print(countPair(arr, k));
    }
}
