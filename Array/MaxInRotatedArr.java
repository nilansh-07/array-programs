public class MaxInRotatedArr {
    public static int findMax(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 8, 1, 2, 3 };

        System.out.println("The Maximum Element in the rotated array is: " + findMax(arr));
    }
}
