class MergeSort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[n + m];
        int j = 0, i = 0;
        int k = 0;
        
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }
        while (i < m) {
            res[k++] = nums1[i++];
        }
        while (j < n) {
            res[k++] = nums2[j++];
        }

        for (i = 0; i < (n + m); i++) {
            nums1[i] = res[i];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1));
        
    }
}
