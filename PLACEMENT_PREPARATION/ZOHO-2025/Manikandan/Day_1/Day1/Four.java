class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();
        
       
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        
        
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            
            if (knows(mat, a, b)) {
                st.push(b); // a can't be celebrity
            } else {
                st.push(a); // b can't be celebrity
            }
        }
        
        int candidate = st.pop();
        
       
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (knows(mat, candidate, i) || !knows(mat, i, candidate)) {
                    return -1; // no celebrity
                }
            }
        }
        return candidate;
    }
    
    boolean knows(int[][] mat, int a, int b) {
        return mat[a][b] == 1;
    }
}
