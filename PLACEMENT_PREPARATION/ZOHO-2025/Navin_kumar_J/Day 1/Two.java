// Implement an algorithm to find pairs in an array that sum up to a specific target.
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(mpp.containsKey(target-nums[i])){
                return new int[] {mpp.get(target-nums[i]),i};
            }
            mpp.put(nums[i],i);
        }
    return new int[] {-1,-1};
    }
}
public class Two {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] mat =  {2,7,11,15};
        int[] ans = obj.twoSum(mat, 9);
        System.out.println(Arrays.toString(ans));
    }
}
// NAVIN KUMAR J