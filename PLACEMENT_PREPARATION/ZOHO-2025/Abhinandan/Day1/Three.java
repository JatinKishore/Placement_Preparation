package Day1;

import java.util.Arrays;

/*
 * @author Abhinandan
 * Problem Statement: Implement an algorithm to perform a cyclic rotation in a given array.
 * [1,2,3,4,5,6] -> [6,5,4,1,2,3] clockwise, k=3
 * [1,2,3,4,5,6] -> [4,5,6,1,2,3] counterclockwise, k=3
 *
 */
public class Three {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 3;
        k = k % arr.length; //at k==n, array goes back to original,for larger k we just need the mod
        rotateClockwise(arr, n, k);
        //rotateCounterClockwise(arr,n,k);
        System.out.println(Arrays.toString(arr));
        //TC: O(n), SC: O(1)
    }

    private static void rotateCounterClockwise(int[] arr, int n, int k) {
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, k, n - 1);
    }

    private static void rotateClockwise(int[] arr, int n, int k) {
        reverse(arr, 0, n - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        int left = start;
        int right = end;
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
