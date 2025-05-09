public class ProductExceptSelf {
    static int[] findProduct(int[] arr) {
        if (arr.length == 0) {
            return new int[] { 0 };
        }

        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        int[] ans = new int[arr.length];
        
        left[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        right[arr.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] result = findProduct(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
