/*
 * The modified array [1, 1, 2, 2, 3] contains at most two occurrences of each unique element, and the method returns 5 as the length of the modified array.
 */

public class RemoveDuplicates2 {
    static int removeDuplicates(int[] arr) {
        if (arr.length <= 2) {
            return arr.length;
        }

        int slow = 0;

        for (int fast = 0; fast < arr.length; fast++) {
            // Check if the current element should be included based on the allowed
            // duplicates condition
            if (slow < 2 || arr[fast] != arr[slow - 2]) {
                arr[slow++] = arr[fast];
            }
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3 };

        System.out.println(removeDuplicates(arr));
    }
}
