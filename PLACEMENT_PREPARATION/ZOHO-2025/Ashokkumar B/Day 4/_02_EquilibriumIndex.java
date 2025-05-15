import java.util.Scanner;

/*
Equilibrium Point

Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is
the same as the sum of elements after it. Return -1 if no such point exists.
Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
Output: 3
 */
public class _02_EquilibriumIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getEquilibriumIndex(arr, n));
    }

    private static int getEquilibriumIndex (int[] arr, int n) {
        int rightSum = 0;
        for (int i=0; i<n; i++) {
            rightSum += arr[i];
        }

        int leftSum = 0;
        for (int i=0; i<n; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }
}
