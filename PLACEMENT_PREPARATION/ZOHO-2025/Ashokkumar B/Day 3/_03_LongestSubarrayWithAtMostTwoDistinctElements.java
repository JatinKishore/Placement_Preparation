/*
Longest Subarray with At Most Two Sistinct Elements.

Input: [1, 1, 1, 2, 2, 3, 3, 4, 4, 5]
Output: 5
 */

import java.util.HashMap;
import java.util.Scanner;

public class _03_LongestSubarrayWithAtMostTwoDistinctElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(getLongestSubArrayLength(arr, n));
    }

    private static int getLongestSubArrayLength(int[] arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        while (right < n) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            int length = right - left + 1;
            if (length > maxLength) {
                maxLength = length;
            }
            right++;
        }
        return maxLength;
    }
}
