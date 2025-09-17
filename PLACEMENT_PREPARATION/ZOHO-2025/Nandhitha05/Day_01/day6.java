1)Daily Temperaure
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] res = new int[n];
        for(int i=n-2; i>=0; i--){
            int j=i+1;
            while(j<n && temp[i]>=temp[j]){
                if(res[j]==0){
                    j=n;
                }else{
                    j+=res[j];
                }
            }
            if(j<n) res[i]=res[j]-i;
        }
      return res;  
    }
}

2) Largest Number 

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a,b)->(b+a).compareTo(a+b));
        if(arr[0].equals("0")) return "0";
        StringBuilder larg = new StringBuilder();
        for(String s : arr){
            larg.append(s);
        }
        return larg.toString();
    }
}

3)Candy Distribution

import java.util.*;

public class Solution {
    public static long candies(int n, List<Integer> arr) {
        int[] candy = new int[n];
        Arrays.fill(candy, 1); 
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                candy[i] = candy[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) > arr.get(i + 1)) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }
        long total = 0;
        for (int c : candy) {
            total += c;
        }

        return total;
    }
}
