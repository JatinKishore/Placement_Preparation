// Implement an algorithm to find the contiguous subarray with the largest sum (Kadane's algorithm).
import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int cm = nums[0];
        int tm = nums[0];
        for(int i=1;i<nums.length;i++){
            cm = Math.max(nums[i],cm+nums[i]);
            tm = Math.max(tm,cm);
        }
        return tm;
    }
}
public class Five {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] mat = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(obj.maxSubArray(mat));
    }
}
// NAVIN KUMAR J