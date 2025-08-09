import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.HashMap;

/*
LeetCode - 525. Contiguous Array
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
Input: nums = [0,1,1,1,1,1,0,0,0]
Output: 6
Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.
 */
public class _05_ContiguousArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getLongestArray(arr, n));
    }

    private static int getLongestArray(int[] nums, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        map.put(0, -1);
        int preSum = 0;
        for (int i=0; i<n; i++) {
            preSum += (nums[i] == 1) ? 1 : -1;
            if (map.containsKey(preSum)) {
                int length = i - map.get(preSum);
                if (length > maxLength) {
                    maxLength = length;
                }
            } else {
                map.put(preSum, i);
            }
        }
        return maxLength;
    }
}
