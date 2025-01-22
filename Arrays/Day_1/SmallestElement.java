package Arrays.Day_1; // Package declaration to organize the class into a specific package.
import java.util.*; // Import statement for using Scanner and other utility classes.

public class SmallestElement { // Class definition.

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
        
        // Calling the findSmallest method to find the smallest element and displaying the result.
        System.out.println("The smallest element in the array is " + findSmallest(arr));
    }

    // Method to find and return the smallest element in the array.
    public static int findSmallest(int arr[]) { 
        int min = arr[0]; // Initialize 'min' with the first element of the array.
        
        // Loop through the array to compare each element with 'min'.
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] < min) { // Update 'min' if a smaller element is found.
                min = arr[i];
            }
        }
        return min; // Return the smallest element.
    }
}
