package Zoho_Practice.Day_2;

// Problem 7: Implement an algorithm to search for an element in a rotated sorted array.
// Sample Input:
// Array: 4 5 6 7 0 1 2
// Target: 0
// Sample Output: Element found at index 4

import java.util.*;

public class Seven {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;

            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of rotated sorted array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Enter target element to search:");
        int target = sc.nextInt();

        int result = search(arr, target);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");

        sc.close();
    }
}

// Author: Keerthivasan A
