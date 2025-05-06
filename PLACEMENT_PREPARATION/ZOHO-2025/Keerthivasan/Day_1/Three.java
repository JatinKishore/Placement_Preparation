package Zoho_Practice;

/*
3. Implement an algorithm to perform a cyclic rotation in a given array.

Sample Input:
Enter array size: 5
Enter elements: 1 2 3 4 5
Enter rotation step (k): 2

Sample Output:
Array after 2 right rotations:
4 5 1 2 3
*/

import java.util.Scanner;

public class Three {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter rotation step (k): ");
        int k = sc.nextInt();

        rotate(arr, k);

        System.out.println("Array after " + k + " right rotations:");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        sc.close();
    }
}

//Name: Keerthivasan A
