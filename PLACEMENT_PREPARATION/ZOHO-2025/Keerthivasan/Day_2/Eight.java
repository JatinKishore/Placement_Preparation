package Zoho_Practice.Day_2;

// Problem 8: Implement an algorithm to find the intersection of two arrays.
// Sample Input:
// Array 1: 1 2 2 1
// Array 2: 2 2
// Sample Output: 2

import java.util.*;

public class Eight {
    public static List<Integer> intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        List<Integer> result = intersection(arr1, arr2);
        System.out.println("Intersection of arrays:");
        for (int num : result) System.out.print(num + " ");

        sc.close();
    }
}

// Author: Keerthivasan A
