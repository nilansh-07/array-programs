public class MaxProductSubArray {
    static int findMaxProduct(int[] arr) {
        if (arr.length == 0)
            return 0;

        int leftProduct = 1;
        int rightProduct = 1;
        int maxProduct = arr[0];

        for (int i = 0; i < arr.length; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            // Prefix Product
            leftProduct *= arr[i];

            // Suffix Product
            rightProduct *= arr[arr.length - 1 - i];

            maxProduct = Math.max(maxProduct, Math.max(leftProduct, rightProduct));
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 0, -5, 6, -1, 4 };

        System.out.println("The Maximum product that can be obtained from array is:" + findMaxProduct(arr));
    }
}
