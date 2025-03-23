package GFG_SHEET_JAVA.Arrays;

import java.util.Scanner;

public class SecondLargest {

    // Function to find the second largest element in an array
    public static int second(int arr[], int n) {
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Return -1 to indicate no second largest element
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) { 
                secondlargest = largest; // Update second largest
                largest = arr[i]; // Update largest
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i]; // Update second largest if a new one is found
            }
        }

        // If secondlargest is still Integer.MIN_VALUE, there was no second largest element
        if (secondlargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
            return -1; // Return -1 to indicate no valid second largest element
        }

        return secondlargest; 
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
        
        // Calling the function and printing the result
        int result = second(arr, n);
        if (result != -1) {
            System.out.println("The second largest element is: " + result);
        }
        
        sc.close();
    }
}
