package Day1;

/*
* @author: Abhinandan
* Problem Statement: Given a square matrix mat[][] of size n x n, such that mat[i][j] = 1
* means ith person knows jth person, the task is to find the celebrity.
* A celebrity is a person who is known to all but does not know anyone.
* Return the index of the celebrity, if there is no celebrity return -1.
* input: mat[][] =           [[1, 1, 0],
                             [0, 1, 0],
                             [0, 1, 1]]
Output: 1
Explanation: 0th and 2nd person both know 1. Therefore, 1 is the celebrity.
* */
public class Four {
    public static void main(String[] args) {
        int n = 3;
        int[][] mat = {{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};
        int celebrity = findTheCelebrity(mat, n);
        System.out.println(celebrity);
        //TC: O(n) and SC: O(1)
    }

    private static int findTheCelebrity(int[][] mat, int n) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (mat[i][j] == 1) {
                i++; //if i knows j, then i cant be a celebrity
            } else j--; //i doesnt know j so j cant be a celebrity
        }
        int candidate = i; //can also be j
        for (int k = 0; k < n; k++) {
            if (candidate != k) {
                if (mat[candidate][k] == 1 || mat[k][candidate] == 0) {
                    return -1;
                }
            }
        }
        return candidate;
    }
}
