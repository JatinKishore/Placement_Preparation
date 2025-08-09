import java.util.PriorityQueue;
import java.util.Scanner;

/*
LeetCode - 862. Shortest Subarray with Sum at Least K

Given an integer array nums and an integer k, return the length of the shortest non-empty subarray of nums with a sum of
at least k. If there is no such subarray, return -1.
A subarray is a contiguous part of an array.
Input: nums = [2,-1,2], k = 3
Output: 3
Input: nums = [56,-21,56,35,-9], k = 61
Output: 2
 */

class Pair {
    long value;
    int index;
    public Pair(long value, int index) {
        this.value = value;
        this.index = index;
    }
}
public class _01_ShortestSubarrayWithSumAtLeastK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(getShortestSubArraySumAtLeastK(arr, n, k));
    }

    private static int getShortestSubArraySumAtLeastK(int[] arr, int n, int k) {
        int ans = Integer.MAX_VALUE;
        long preFixSum = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.value, b.value));
        for (int i=0; i<n; i++) {
            preFixSum += arr[i];

            if (preFixSum >= k) {
                ans = Math.min(ans, i+1);
            }
            while(!pq.isEmpty() && preFixSum - pq.peek().value >= k) {
                ans = Math.min(ans, i - pq.poll().index);
            }

            pq.offer(new Pair(preFixSum, i));
        }
        if (ans == Integer.MAX_VALUE) return -1;
        return  ans;
    }
}






































