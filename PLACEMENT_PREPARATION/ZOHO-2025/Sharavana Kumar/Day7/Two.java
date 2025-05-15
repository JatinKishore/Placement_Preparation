class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<int[]>st = new Stack<>();
        int[] dist = new int[arr.length];
        int n = arr.length-1;
        for(int i = n ; i >= 0 ; i--){
            while(!st.isEmpty() && arr[i]>=st.peek()[0]){
                st.pop();
            }
            if(st.isEmpty()){
                dist[i] = 0;
            }else{
                dist[i] = st.peek()[1] - i;
            }
            st.push(new int[]{arr[i],i});
        }
        return dist;
    }
}
