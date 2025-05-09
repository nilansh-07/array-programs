public class MinInRotatedArr {
    public static int findMin(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 4, 5, 1, 2 };

        System.out.println("The Minimum Element in the rotated array is: " + findMin(arr));
    }
}
