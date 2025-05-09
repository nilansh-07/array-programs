import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];

            if (map.containsKey(result)) {
                return new int[] { map.get(result), i };
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("Not found");
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 17;

        int[] result = twoSum(arr, target);

        for(int i:result){
            System.out.print(i+" ");
        }
    }
}