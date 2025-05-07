class Solution {
    int[][] memo;
    public int lengthOfLIS(int[] nums) {
        memo = new int[nums.length+1][nums.length+1];
        for(int[] j : memo){
            Arrays.fill(j,-1);
        }
        int res = helper(-1,0,nums);
        return res;
    }
    public int helper(int prevIdx,int currIdx,int[] nums){
        if(currIdx==nums.length){
            return 0;
        }
        if(memo[prevIdx+1][currIdx]!=-1){
            return memo[prevIdx+1][currIdx];
        }
        int take = 0;
        if(prevIdx==-1){
            take = 1 + helper(currIdx,currIdx+1,nums);
        }
        if(prevIdx != -1 && nums[prevIdx]<nums[currIdx]){
            take = 1 + helper(currIdx,currIdx+1,nums);
        }
        int notake = helper(prevIdx,currIdx+1,nums);
        return memo[prevIdx+1][currIdx] = Math.max(notake,take);
    }
}
