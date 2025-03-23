package GFG_SHEET_JAVA.Arrays;

import java.util.Scanner;

public class RotateArrayKTimes {
    
    // Function to rotate the array k times to the right
    public static void rotateArray(int arr[], int n, int k) {
        if (k == 0)  // Base condition: if k becomes 0, stop recursion
            return;
        
        int temp = arr[n - 1]; // Store the last element
        
        // Shift elements to the right by one position
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        arr[0] = temp; // Place the last element at the first position

        // Recursively call the function for remaining (k-1) rotations
        rotateArray(arr, n, k - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for array size
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int arr[] = new int[n]; // Declare the array
        
        // Taking input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int k = 2; // Number of times to rotate the array
        
        rotateArray(arr, n, k); // Function call to rotate the array
        
        // Printing the rotated array
        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        sc.close(); // Closing the scanner to prevent memory leaks
    }
}
