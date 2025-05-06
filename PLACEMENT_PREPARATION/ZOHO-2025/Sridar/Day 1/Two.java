//Two sum logic using hashmapping
import java.util.*;
public class TwoSumWithInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take array 
        System.out.print("Enter number of elements");
        int n = sc.nextInt();
        //Input array elements
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target");
        int target = sc.nextInt();
        int[] result = findTwoSum(nums, target);
        //result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " and " + nums[result[1]]);
        } else {
            System.out.println("No pair found that adds up to the target.");
        }

        sc.close();
    }
//hashmap
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
   map.put(current, i);
        }
        return new int[] {};
    }
}
