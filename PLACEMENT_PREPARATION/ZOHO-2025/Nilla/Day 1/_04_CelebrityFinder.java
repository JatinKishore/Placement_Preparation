public class CelebrityFinder {
    public static int findCelebrity(int[][] mat, int n) {
        int candidate = 0;
        for (int i = 1; i < n; i++) {
            if (knows(mat, candidate, i)) {
                candidate = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (knows(mat, candidate, i) || !knows(mat, i, candidate)) {
                    return -1;
                }
            }
        }
        return candidate;
    }
    private static boolean knows(int[][] mat, int a, int b) {
        return mat[a][b] == 1;
    }
    public static void main(String[] args) {
        int[][] mat1 = { {1, 1, 0}, {0, 1, 0}, {0, 1, 1} };
        System.out.println(findCelebrity(mat1, mat1.length)); 
        int[][] mat2 = { {1, 1}, {1, 1} };
        System.out.println(findCelebrity(mat2, mat2.length)); 

        int[][] mat3 = { {1} };
        System.out.println(findCelebrity(mat3, mat3.length)); 
    }
}
