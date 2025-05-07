/******************************************************************************

Implement an algorithm to rotate an NxN matrix by 90 degrees.

input:
{1,2,3}
{4,5,6}
{7,8,9}

output:
[7, 4, 1]
[8, 5, 2]
[9, 6, 3]



*******************************************************************************/
import java.util.*;
public class One
{
	public static void main(String[] args) {
	    int N = 3;
		int[][] arr = new int[][]{
		    {1,2,3},
		    {4,5,6},
		    {7,8,9}
		};
		
		int[][] newArr = new int[N][N];
		for(int j=N-1;j>=0;j--){
		    for(int i=0;i<N;i++){
		       newArr[i][N-j-1] = arr[j][i];
		    }
		}
		
		for(int[] i : newArr){
		    System.out.println(Arrays.toString(i));
		}
	}
}

//jatin kishore 
// - Time Complexity: O(N^2)
// - Space Complexity: O(N^2)

