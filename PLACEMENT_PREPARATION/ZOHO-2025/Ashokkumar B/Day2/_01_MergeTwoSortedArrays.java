/*
LeetCode - 88. Merge Sorted Array

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] arr1 = new int[m];
        for (int i=0; i<m; i++) {
            arr1[i] = in.nextInt();
        }
        int n = in.nextInt();
        int[] arr2 = new int[n];
        for (int i=0; i<n; i++) {
            arr2[i] = in.nextInt();
        }

        mergeTwoSortedArray(arr1, m, arr2, n);
    }

    private static void mergeTwoSortedArray(int[] arr1, int m, int[] arr2, int n) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (left < m && right < n) {
            if (arr1[left] <= arr2[right]) {
                list.add(arr1[left]);
                left++;
            } else {
                list.add(arr2[right]);
                right++;
            }
        }
        while (left < m) {
            list.add(arr1[left]);
            left++;
        }
        while (right < n) {
            list.add(arr2[right]);
            right++;
        }
        System.out.println(list);
    }
}
