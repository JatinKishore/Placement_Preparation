import java.util.Scanner;
public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rotateRightByOne(arr);

        System.out.println("Array after rotation-");
        for (int val : arr) {
            System.out.print(val + " ");
        }

        sc.close();
    }

    public static void rotateRightByOne(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        int last = arr[n - 1]; 

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last; 
    }
}
