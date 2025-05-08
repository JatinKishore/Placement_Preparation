// Implement an algorithm to rotate an NxN matrix by 90 degrees. 

class Solution {
    public void rotate(int[][] matrix) {

        int[][] res = new int[matrix.length][matrix.length];

        
        int  right = matrix.length-1;

        for(int i = 0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[i].length;j++){
        
              res[j][right] = matrix[i][j];
          
            }
            right--;
            
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                
                matrix[i][j] = res[i][j];
            }
          
        }
    }


//keerthi
