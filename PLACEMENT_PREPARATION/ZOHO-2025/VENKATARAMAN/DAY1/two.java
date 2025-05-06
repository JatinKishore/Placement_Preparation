import java.util.*;

public class PairSumSimple {

    public static List<int[]> findPairs(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        Set<Integer> used = new HashSet<>();

        for (int num : arr) {
            int comp = target - num;
            if (seen.contains(comp) && !used.contains(num) && !used.contains(comp)) {
                // add the pair in ascending order
                result.add(new int[]{Math.min(num, comp), Math.max(num, comp)});
                used.add(num);
                used.add(comp);
            }
            seen.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 3};
        int target = 5;
        List<int[]> pairs = findPairs(nums, target);
        for (int[] p : pairs) {
            System.out.println(p[0] + ", " + p[1]);
        }
    }
}
// VENKATARAMAN 
