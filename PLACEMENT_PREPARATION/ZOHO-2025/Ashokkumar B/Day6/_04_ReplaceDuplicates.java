/*
 Replace Duplicates

Given a sorted integer array. We need to make array elements distinct by increasing values and keeping the array sum
minimum possible. We need to print the minimum possible sum as output.

Note :- After increasing the values of the array , the sorted order should be maintained.
Input : arr[ ] = {2, 2, 3, 5, 6}
Output : 20
 */


import java.util.Scanner;

public class _04_ReplaceDuplicates {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(minimumSum(arr, n));
    }

    private static int minimumSum(int[] arr, int n) {
        int minimumSum = arr[0];
        int prev = arr[0];
        for (int i=1; i<n; i++) {
            if (arr[i] <= prev) {
                prev = prev + 1;
                minimumSum += prev;
            } else {
                minimumSum += arr[i];
                prev = arr[i];
            }
        }
        return minimumSum;
    }
}
