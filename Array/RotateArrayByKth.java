public class RotateArrayByKth {
    static void rotate(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 8, 9, 5, 11, 39, 44 };
        int size = arr.length;
        int k = 2;

        rotate(arr, 0, k - 1);
        rotate(arr, k, size - 1);
        rotate(arr, 0, size - 1);

        System.out.print("The Rotated array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
