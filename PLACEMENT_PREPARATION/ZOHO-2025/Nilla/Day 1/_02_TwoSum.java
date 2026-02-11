class TwoSum {
    public int[] twoSumMap(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                return new int[] {map.get(res) , i};
            }
            map.put(nums[i] , i);
        }
        return new int[]{-1 ,-1};
    }
   public static int[] twoSumWithoutMap(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
         return new int[]{-1 ,-1};
   }
   public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSumMap(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        result = twoSumWithoutMap(nums , target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
  
}
