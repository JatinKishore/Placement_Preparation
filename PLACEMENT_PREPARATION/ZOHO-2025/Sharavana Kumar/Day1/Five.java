class Solution {
    public int celebrity(int[][] mat) {
        int n = mat.length;
        int[] indegree = new int[n];
        int[] outdegree = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && i != j) {
                    indegree[j]++;
                    outdegree[i]++;
                }
            }
        }

        int celebrity = -1;
        for (int i = 0; i < n; i++) {
            if (indegree[i] == n - 1 && outdegree[i] == 0) {
                celebrity = i;
            }
        }

        return celebrity;
    }
}
