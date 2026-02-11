class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int layer = 0 ; layer < n/2 ; layer++){
            int first = layer;
            int last = n-1-layer;
            for(int i = first ; i<last ; i++){
                int offset = i - first ;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
    }
     public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(matrix);
        printMatrix(matrix);
    }
}
