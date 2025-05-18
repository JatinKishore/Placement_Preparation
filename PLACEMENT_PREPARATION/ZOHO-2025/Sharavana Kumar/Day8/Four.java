class Solution {
    static long isPallindrome(long N) {
        long size = (int)(Math.log(N)/Math.log(2))+1;
        long i = 0;
        long j = size-1;
        while(i<=j){
            int bit1 = (N&(1<<i))==0 ? 0 : 1;
            int bit2 = (N&(1<<j))==0 ? 0: 1;
            if(bit1!=bit2)return (long)0;
            i++;
            j--;
        }
        return (long)1;
        
        
    }
}
