// Implement an algorithm to rotate an NxN matrix by 90 degrees.
import java.util.*;

class Solution {
    public void rotate1(int[][] matrix) {
        int N = matrix.length;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<(int)N/2;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][N-j-1];
                matrix[i][N-j-1] = t;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(N-j-1 == i && N-i-1 == j)
                    break;
                int t = matrix[i][j];
                matrix[i][j] = matrix[N-j-1][N-i-1];
                matrix[N-j-1][N-i-1] = t;
            }
        }

        System.out.print(Arrays.deepToString(matrix));
    }
    public void rotate2(int[][] matrix) {
        int N = matrix.length;
        
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<(int)N/2;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][N-j-1];
                matrix[i][N-j-1] = t;
            }
        }
        
    }
}

class One {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] mat =  {{1,2,3},{4,5,6},{7,8,9}};
        obj.rotate1(mat);
        obj.rotate2(mat);
        System.out.println(Arrays.deepToString(mat));
    }
}
// NAVIN KUMAR J