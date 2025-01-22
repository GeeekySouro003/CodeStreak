package Arrays.Day_1; // Package declaration to organize the class into a specific package.
import java.util.*; // Import statement for using Scanner and other utility classes.

public class LargestElement { // Class definition.

    public static void main(String args[]) { // Main method: Entry point of the program.
        Scanner sc = new Scanner(System.in); // Scanner object for user input.
        
        // Prompting the user to enter the length of the array.
        System.out.println("Enter the length of the array"); 
        int n = sc.nextInt(); // Reading the length of the array.
        
        int arr[] = new int[n]; // Declaring an array of size 'n'.
        
        // Prompting the user to enter the elements of the array.
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) { 
            arr[i] = sc.nextInt(); // Reading each element into the array.
        }
        
        // Calling the isLargest method to find the largest element and displaying the result.
        System.out.println("The largest element in the array is " + isLargest(arr));
    }

    // Method to find and return the largest element in the array.
    public static int isLargest(int arr[]) { 
        int max = arr[0]; // Initialize 'max' with the first element of the array.
        
        // Loop through the array to compare each element with 'max'.
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] > max) { // Update 'max' if a larger element is found.
                max = arr[i];
            }
        }
        return max; // Return the largest element.
    }
}
