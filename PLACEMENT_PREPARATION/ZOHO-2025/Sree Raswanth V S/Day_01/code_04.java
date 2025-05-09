class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        // Push all people into a stack
        int[] stack = new int[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            stack[++top] = i;
        }
        // Eliminate non-celebrities
        while (top >= 1) {
            int a = stack[top--];
            int b = stack[top--];
            if (mat[a][b] == 1) {
                // a knows b, so a cannot be a celebrity, but b might be
                stack[++top] = b;
            } else {
                // a does not know b, so b cannot be a celebrity, but a might be
                stack[++top] = a;
            }
        }
        // Verify the remaining person is a celebrity
        int candidate = stack[top];
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // candidate should not know i, and i should know candidate
                if (mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                    return -1;
                }
            }
        }
        return candidate;
    }
}
