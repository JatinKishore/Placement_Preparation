class Solution {
    public void sortColors(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i  = 0 ; i < nums.length ; i++){
            max = Math.max(nums[i],max);
        }
        int[] res = new int[max+1];
        for(int i = 0 ; i < nums.length; i++){
            res[nums[i]] = res[nums[i]] + 1; 
        }
        int count = 0;
        System.out.println(Arrays.toString(res));
        for(int i = 0 ; i < res.length ; i++){
            for(int j = 0 ; j < res[i] ; j++){
                nums[count++] = i;
            }
        }
    }
}
