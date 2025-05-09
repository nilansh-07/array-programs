import java.util.HashSet;

public class ContainDuplicates {

    static boolean findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } 
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 8 };
        if (findDuplicates(arr)) {
            System.out.println("There's duplicate element present in the array.");
        } else {
            System.out.println("There's no duplicate element present in the array.");
        }
    }
}
