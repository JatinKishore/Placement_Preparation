/******************************************************************************

Implement an algorithm to find pairs in an array that sum up to a specific target.


Input:

target = 104;
arr = {100,1,2,3,4,5}

OUTPUT:

104

*******************************************************************************/
import java.util.*;
public class Two
{
	public static void main(String[] args) {
	    int target = 104;
	    int[] arr = new int[]{100,1,2,3,4,5};
	    System.out.println(Arrays.toString(sumFinder(arr,target)));
	}
	
	public static int[] sumFinder(int[] arr, int target){
	    HashMap<Integer, Integer> hm = new HashMap<>();
	    for(int i=0;i<arr.length;i++){
	        int result = Math.abs(target - arr[i]);
	        if(hm.containsKey(result)){
	            return new int[]{result,arr[i]};
	        }
	        hm.put(arr[i],0);
	    }
	    return new int[]{-1,-1};
	}
}

//jatin kishore 
// - Time Complexity: O(N)
// - Space Complexity: O(N)

