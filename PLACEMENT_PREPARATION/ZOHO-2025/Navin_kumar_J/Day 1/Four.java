// Find the "celebrity" in a party using a given array of people.
import java.util.*;

class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        int[] cnt = new int[n];
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    cnt[j]++;
                    mpp.put(i, mpp.getOrDefault(i, 0) + 1);
                }
            }
        }
        for(int i=0;i<n;i++){
            // System.out.println(cnt[i]);
            if(cnt[i]==n && mpp.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}

public class Four {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] mat =  {{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int ans = obj.celebrity(mat);
        System.out.println(ans);
    }
}
// NAVIN KUMAR J