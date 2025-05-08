import java.util.Scanner;

/*
LeetCode - 169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority
element always exists in the array.

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class _04_MajorityElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getMajorityElement(arr, n));
    }
    // Boyer-Moore Voting Algorithm
    private static int getMajorityElement(int[] arr, int n) {
        int count = 0;
        int element = 0;
        for (int i=0; i<n; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int i=0 ;i<n; i++) {
            if (element == arr[i]) {
                count++;
            }
        }
        if (count >= n/2) return element;
        return -1;
    }
}
