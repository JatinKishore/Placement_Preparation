// Implement an algorithm to perform a cyclic rotation in a given array. 
import java.util.*;
class Solution {
    public void reverse(int[] nums,int s,int e){
        while(s<e){
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n<2){
            return;
        }
        k=k%n;
        reverse(nums,0,n - 1);
        reverse(nums,0,k-1);
        reverse(nums,k,n - 1);
    }
}
public class Three {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] mat = {1,2,3,4,5,6,7};
        obj.rotate(mat,3);
        System.out.println(Arrays.toString(mat));
    }
}
// NAVIN KUMAR J