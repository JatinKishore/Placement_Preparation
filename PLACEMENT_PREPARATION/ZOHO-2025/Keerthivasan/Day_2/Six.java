package Zoho_Practice.Day_2;

// Problem 6: Implement an algorithm to merge two sorted arrays.
// Sample Input:
// Array 1: 1 3 5
// Array 2: 2 4 6
// Sample Output:
// Merged Array: 1 2 3 4 5 6

import java.util.*;

public class Six {
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first sorted array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter size of second sorted array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        int[] merged = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged Array:");
        for (int num : merged) System.out.print(num + " ");

        sc.close();
    }
}

// Author: Keerthivasan A
