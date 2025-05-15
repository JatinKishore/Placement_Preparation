/*
LeetCode - 4. Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class _04_MedianofTwoSortedArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] nums1 = new int[n1];
        for (int i=0; i<n1; i++) {
            nums1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] nums2 = new int[n2];
        for (int i=0; i<n2; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(getMedian(nums1, n1, nums2, n2));
    }

    private static double getMedian(int[] nums1, int n1, int[] nums2, int n2) {
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (left < n1 && right < n2) {
            if (nums1[left] <= nums2[right]) {
                list.add(nums1[left]);
                left++;
            } else {
                list.add(nums2[right]);
                right++;
            }
        }
        while (left < n1) {
            list.add(nums1[left]);
            left++;
        }
        while (right < n2) {
            list.add(nums2[right]);
            right++;
        }
        int length = list.size();
        int idx1 = length / 2;
        if (length % 2 == 1) {
            return (double) list.get(idx1);
        }
        int idx2 = idx1 - 1;
        return ((list.get(idx1) + list.get(idx2)) / (double)2);
    }
}
