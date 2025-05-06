
// Original matrix:
// 1	2	3   5
// 4	5	6   2
// 7	8	9   1

// Matrix after 90-degree rotation:
// 7	4	1
// 8	5	2
// 9	6	3
// 1    2   5


public class MatrixRotation {

    public static void rotate90Clockwise(int[][] matrix) {
        int N = matrix.length;


        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            int left = 0, right = N - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 5},
            {4, 5, 6, 2},
            {7, 8, 9, 1}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        rotate90Clockwise(matrix);

        System.out.println("\nMatrix after 90-degree rotation:");
        printMatrix(matrix);
    }
}
// VENKATARAMAN P

