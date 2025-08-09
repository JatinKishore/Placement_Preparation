class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int candidate1 = 0, candidate2 = 1; 
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        return result;
    }
   public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {1};
        System.out.println("Output 1: " + majorityElement(nums1)); 
        System.out.println("Output 2: " + majorityElement(nums2)); 
    }
}
