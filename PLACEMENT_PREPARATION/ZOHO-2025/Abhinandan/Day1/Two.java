package Day1;

import java.util.*;

/*
 * @author Abhinandan
 * Problem Statement: Implement an algorithm to find pairs in an array that sum up to a specific target.
 * [1,2,3,4,5,6,7,8,9,10] target = 10
 * output = [1,9],[2,8],[3,7],[4,6]
 * 1) Brute force + Two loops -> TC: O(n^2) and SC: O(1)
 * 2) Sort+Two pointer -> TC: O(nlog(n)) and SC: O(1)
 * 3) HashSet -> TC: O(n) and SC O(n),
 * */
public class Two {
    static List<int[]> pairs = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        findPairsSumUptoTarget(nums, target);
        pairs.stream()
                .map(Arrays::toString)
                .forEach(System.out::println);
    }

    private static void findPairsSumUptoTarget(int[] nums, int target) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (st.contains(complement)) {
                pairs.add(new int[]{nums[i], complement});
            }
            st.add(nums[i]);
        }
    }
}
