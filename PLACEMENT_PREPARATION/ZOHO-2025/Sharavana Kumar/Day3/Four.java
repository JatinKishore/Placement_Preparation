class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer>arr = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else if(nums2[j]<nums1[i]){
                arr.add(nums2[j]);
                j++;
            }else{
                arr.add(nums1[i]);
                arr.add(nums2[j]);
                i++;
                j++;
            }
        }
        while(i<nums1.length){
            arr.add(nums1[i++]);
        }
        while(j<nums2.length){
            arr.add(nums2[j++]);
        }
        int size = arr.size();
        double res = 0;
        if(size%2==0){
            res = ((arr.get(size/2) + arr.get(size/2-1)) /2.0);
        }else{
            res = (arr.get(size/2));
        }
        return res;

    }
}
