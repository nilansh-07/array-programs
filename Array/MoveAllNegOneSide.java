public class MoveAllNegOneSide {
    static void moveNegElement(int[] arr, int n) {
        int low = 0;
        int high = n - 1;

        while (low < high) {
            if (arr[low] > 0 && arr[high] < 0) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }

            else if (arr[low] < 0 && arr[high] < 0) {
                low++;
            }

            else if (arr[low] < 0 && arr[high] > 0) {
                low++;
                high++;
            }

            else {
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, 7, 5, -3, 6 };

        moveNegElement(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
