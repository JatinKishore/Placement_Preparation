//Implement an algorithm to find the equilibrium index of an array.

public class EquilibriumIndex {
   public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; 
            if (leftSum == totalSum) {
                return i; 
            }
            leftSum += arr[i]; 
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int index = findEquilibriumIndex(arr);
        if (index != -1) {
            System.out.println("Equilibrium index is: " + index);
        } else {
            System.out.println("No equilibrium index found.");
        }
    }
}
