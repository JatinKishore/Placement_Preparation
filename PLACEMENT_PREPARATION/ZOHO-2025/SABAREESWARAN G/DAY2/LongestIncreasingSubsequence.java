import java.util.*;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums){
     List<Integer> list=new ArrayList<>();

     for(int n:nums){
         int left=0,right=list.size();
         while(left<right){
             int mid=(left+right)/2;
             if(n>list.get(mid)){
                 left=mid+1;
             }else{
                 right=mid;
             }
         }
         if(left<list.size()){
             list.set(left,n);
         }else{
             list.add(n);
         }
     }
     for(int n:list){
         System.out.println(n);
     }
     return list.size();
    }
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("Length of LIS: " + lengthOfLIS(nums));
    }

}
