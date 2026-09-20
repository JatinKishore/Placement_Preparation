public class CelebrityFinder {

    public static int findCelebrity(int[][] mat, int n) {
        int candidate = 0;

        for (int i = 1; i < n; i++) {
            if (mat[candidate][i] == 1) {
                candidate = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                    return -1;
                }
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 1, 0},
            {0, 1, 0},
            {0, 1, 1}
        };
        System.out.println("Celebrity: " + findCelebrity(mat1, mat1.length)); 

        int[][] mat2 = {
            {1, 1},
            {1, 1}
        };
        System.out.println("Celebrity: " + findCelebrity(mat2, mat2.length)); 

        int[][] mat3 = {
            {1}
        };
        System.out.println("Celebrity: " + findCelebrity(mat3, mat3.length)); 
    }
} // Venkataraman
