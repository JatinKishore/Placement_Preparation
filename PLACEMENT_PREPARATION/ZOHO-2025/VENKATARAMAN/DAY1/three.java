import java.util.Arrays;

public class cyclicroatation {
     public static void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k = k % n;                  
        int[] tmp = new int[n];     


        for (int i = 0; i < n; i++) {
            tmp[(i + k) % n] = arr[i];
        }

        System.arraycopy(tmp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println("Original: " + Arrays.toString(a));

        rotate(a, 2); 
        System.out.println("Rotated by 2: " + Arrays.toString(a));
        
        rotate(a, 3);  
        System.out.println("Rotated by 3: " + Arrays.toString(a));
    }
}
// venkataraman
