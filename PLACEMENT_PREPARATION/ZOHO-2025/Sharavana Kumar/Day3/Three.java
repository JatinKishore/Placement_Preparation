class Solution {
    public static int totalElements(Integer[] arr) {
        int left = 0;
        int right = 0;
        HashMap<Integer,Integer>hm = new HashMap<>();
        int max = 0;
        while(right<arr.length){
            hm.put(arr[right],hm.getOrDefault(arr[right],0)+1);
            while(hm.size()>2){
                int n = arr[left];
                hm.put(arr[left],hm.getOrDefault(arr[left],0)-1);
                if(hm.get(arr[left])==0){
                    hm.remove(arr[left]);
                }
                left++;
            }
            int size = right - left + 1;
            max = Math.max(max,size);
            right++;
        }
        return max;
        
    }
}
