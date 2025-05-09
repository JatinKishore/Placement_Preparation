import java.util.Scanner;

/*
LeetCode - 41. First Missing Positive

Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 */
public class _01_FirstMissingPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getFirstPositive(arr, n));
    }

    private static int getFirstPositive(int[] arr, int n) {
        int[] visit = new int[n+1];
        for (int i=0; i<n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                visit[arr[i]] = 1;
            }
        }
        for (int i=1; i<=n; i++) {
            if (visit[i] == 0) return i;
        }
        return n + 1;
    }

}
