/*
LeetCode - 229. Majority Element II

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Input: nums = [3,2,3]
Output: [3]
Input: nums = [1,2]
Output: [1,2]
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_MajorityElementII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(getMajorityElements(arr, n));
    }

    private static List<Integer> getMajorityElements(int[] arr, int n) {
        int count1 = 0,count2 = 0;
        int el1 = 0,el2 = 0;
        for (int i=0; i<n;i++) {
            if (count1 == 0 && el2 != arr[i]) {
                count1 = 1;
                el1 = arr[i];
            } else if(count2 == 0 && el1 != arr[i]) {
                count2 = 1;
                el2 = arr[i];
            } else if (el1 == arr[i]) {
                count1++;
            } else if (el2 == arr[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;
        for (int i=0; i<n; i++) {
            if (el1 == arr[i]) {
                count1++;
            } else if (el2 == arr[i]) {
                count2++;
            }
        }

        List<Integer> list = new ArrayList<>();
        if (count1 > n/3) list.add(el1);
        if (count2 > n/3) list.add(el2);
        return list;
    }
}
