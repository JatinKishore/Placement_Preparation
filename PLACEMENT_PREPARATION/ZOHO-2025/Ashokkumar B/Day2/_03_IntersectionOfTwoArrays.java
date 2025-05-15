/*
LeetCode - 349. Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique
and you may return the result in any order.

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.HashMap;

public class _03_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for (int i=0; i<n1; i++) {
            arr1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0; i<n2; i++) {
            arr2[i] = in.nextInt();
        }

        System.out.println(getInterSection(arr1, n1, arr2, n2));
    }

    private static List<Integer> getInterSection(int[] arr1, int n1, int[] arr2, int n2) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n1; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i=0; i<n2; i++) {
            if (map.containsKey(arr2[i])) {
                result.add(arr2[i]);
                map.remove(arr2[i]);
            }
        }
        return result;
    }
}
