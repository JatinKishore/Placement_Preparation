/*
LeetCode - 350. Intersection of Two Arrays II

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear
as many times as it shows in both arrays and you may return the result in any order.

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
 */

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class _03_IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for (int i=0; i<n1; i++) {
            arr1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0; i<n2 ;i++) {
            arr2[i] = in.nextInt();
        }

        System.out.println(getInteeSection(arr1, n1, arr2, n2));
    }

    private static List<Integer> getInteeSection(int[] arr1, int n1, int[] arr2, int n2) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n1; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }

        for (int i=0; i<n2; i++) {
            if (map.containsKey(arr2[i])) {
                list.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i]) - 1);
                if (map.get(arr2[i]) == 0) map.remove(arr2[i]);
            }
        }
        return  list;
    }
}
