/*
LeetCode - 739. Daily Temperatures
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is
the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which
this is possible, keep answer[i] == 0 instead.

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class _01_DailyTemperatures {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] temperatures = new int[n];
        for (int i=0; i<n ;i++) {
            temperatures[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }

    private static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for (int i=n-1; i>=0; i--) {
            while (!stack.isEmpty()) {
                if (temperatures[stack.peek()] > temperatures[i]) {
                    ans[i] = stack.peek() - i;
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                ans[i] = 0;
            }
            stack.push(i);
        }
        return ans;
    }
}
