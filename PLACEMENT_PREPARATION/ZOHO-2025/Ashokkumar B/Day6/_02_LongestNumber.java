/*
LeetCode - 179. Largest Number
Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
Since the result may be very large, so you need to return a string instead of an integer.

Input: nums = [3,30,34,5,9]
Output: "9534330"
 */

import java.util.Scanner;

public class _02_LongestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(largestNumber(arr));
    }

    private static String largestNumber(int[] nums) {
        int n = nums.length;
        for(int i=0 ;i<n; i++) {
            int j = i;
            while(j > 0 && canSwap(nums[j-1], nums[j]) == true) {
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        if(nums[0] == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for(int i=0; i<n; i++) {
            result.append(nums[i]);
        }

        return new String(result);
    }

    private static boolean canSwap(int n1, int n2) {
        String s1 = ""+n1+n2;
        String s2 = ""+n2+n1;
        int n = s1.length();
        int left = 0;
        int right = 0;
        while(left < n) {
            if( (s1.charAt(left)-'0') > (s2.charAt(right)-'0') ) {
                return false;
            }
            else if ( (s2.charAt(right)-'0') > (s1.charAt(left)-'0') ) {
                return true;
            }
            left++;
            right++;
        }
        return false;
    }
}
