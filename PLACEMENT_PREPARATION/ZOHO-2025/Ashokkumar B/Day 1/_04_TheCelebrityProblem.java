/*
The Celebrity Problem

A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people.
A square matrix mat[][] (n*n) is used to represent people at the party such that if an element of row i and column j is set
to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity
does not exist, return -1.
 */
public class _04_TheCelebrityProblem {
    public static void main(String[] args) {
        int[][] mat = { {1, 1, 0},
                        {0, 1, 0},
                        {0, 1, 1} };

        System.out.println(findCelebrity(mat));
    }
    private static int findCelebrity(int[][] mat) {
        int n = mat.length;
        int[] knowMe = new int[n];
        int[] iKnow = new int[n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i != j && mat[i][j] == 1) {
                    knowMe[j]++;
                    iKnow[i]++;
                }
            }
        }

        for (int i=0; i<n; i++) {
            if (knowMe[i] == n-1 && iKnow[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
