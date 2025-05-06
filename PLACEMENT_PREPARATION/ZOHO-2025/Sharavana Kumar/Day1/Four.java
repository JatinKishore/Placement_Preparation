class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
     
    }
    public void reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void reverse(int[] arr,int a,int b){
        int i = a;
        int j = b;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
