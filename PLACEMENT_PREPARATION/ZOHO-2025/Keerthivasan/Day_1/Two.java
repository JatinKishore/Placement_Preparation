package Zoho_Practice;

/*
2. Implement an algorithm to find pairs in an array that sum up to a specific target.

Sample Input:
Enter array size: 6
Enter elements: 2 4 3 5 6 -2
Enter target: 7

Sample Output:
Pairs that sum to 7:
(2, 5)
(4, 3)
(-2, 9)  ← if 9 were in input
*/

import java.util.*;

public class Two {
    public static void findPairs(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> printed = new HashSet<>();

        System.out.println("Pairs that sum to " + target + ":");
        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                String pair = "(" + Math.min(num, complement) + ", " + Math.max(num, complement) + ")";
                if (!printed.contains(pair)) {
                    System.out.println(pair);
                    printed.add(pair);
                }
            }
            seen.add(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        findPairs(arr, target);

        sc.close();
    }
}

//Name: Keerthivasan A

