//USING STACK FOR REVERSING AN ARRAY
package Arrays.Day_1;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Accept array size
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Accept array elements
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Reverse and print the array using stack
        reverseUsingStack(arr, n);
    }

    // Method to reverse the array using a stack
    public static void reverseUsingStack(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements of the array onto the stack
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }

        // Pop elements from the stack back into the array
        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }

        // Call the printArray method to display the reversed array
        printArray(arr, n);
    }

    // Method to print the array
    public static void printArray(int arr[], int n) {
        System.out.print("Reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}










//USING TWO POINTER APPROACH 
// package Arrays.Day_1;

// public class ReverseArray {

//     public static void main(String args[]) {
//         // Define the array and its size
//         int n = 5;
//         int arr[] = {4, 8, 5, 3, 1};

//         // Call the reverse method
//         reverse(arr, n);
//     }

//     // Method to reverse the array
//     public static void reverse(int arr[], int n) {
//         int start = 0, end = n - 1;
//         while (start < end) {
//             // Swap elements at start and end
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }

//         // Call the printArray method to display the reversed array
//         printArray(arr, n);
//     }

//     // Method to print the array
//     public static void printArray(int arr[], int n) {
//         System.out.print("Reversed array is: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println(); // New line after printing the array
//     }
// }
