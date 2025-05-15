/*
LeetCode  - 135. Candy
There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:
    Each child must have at least one candy.
    Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children.

Input: ratings = [1,2,2]
Output: 4
 */

import java.util.Scanner;
public class _03_CandyProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        int minimumCandies = getMinimumCandies(arr, n);
        System.out.println(minimumCandies);
    }

    private static int getMinimumCandies(int[] arr, int n) {
        int noOfCandies = 1;
        int i = 1;
        while (i < n) {
            if (arr[i-1] == arr[i]) {
                noOfCandies += 1;
                i++;
                continue;
            }
            int peek = 1;
            while (i < n && arr[i-1] < arr[i]) {
                peek += 1;
                noOfCandies += peek;
                i++;
            }
            int down = 1;
            while (i<n && arr[i-1] > arr[i]) {
                noOfCandies += down;
                down += 1;
                i++;
            }
            if (down > peek) {
                noOfCandies += (down - peek);
            }
        }
        return noOfCandies;
    }
}
