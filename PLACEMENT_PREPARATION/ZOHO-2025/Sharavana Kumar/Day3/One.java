class Solution {
    public int firstMissingPositive(int[] nums) {
       int n = nums.length;
       for(int i = 0 ; i < nums.length; i++){
        while(nums[i]>=1 && nums[i]<=n && nums[i]!=nums[nums[i]-1]){
            swap(i,nums[i]-1,nums);
        }
       }
        for(int j = 0 ; j < n ; j++){
            if(j!=nums[j]-1){
                return j+1;
            }
        }
        return n+1;
    }
    public void swap(int i ,int j,int[] nums){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
