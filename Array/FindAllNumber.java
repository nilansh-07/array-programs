import java.util.ArrayList;

public class FindAllNumber {
    public static void main(String[] args) {

        int[] nums = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };

        int n = nums.length;

        // Marks elements presence by negations

        for (int num : nums) {
            
            int indx = Math.abs(num) - 1;

            if (nums[indx] > 0)
                nums[indx] = -nums[indx];
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // Where there's no negation is done (i.e.,Positive no.) that no. is missing.

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                ans.add(i + 1);
        }

        System.out.print("The missing number are: ");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
