package Arrays;
//IMPROVE THE LOGIC OF 10,100,1000S IN LEXOGRAPHICAL MANNER

import java.util.Scanner;

public class SmallestElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String small = null; // Variable to store the smallest string
        
        System.out.println("Enter the elements (Type 'RUKOOO' to stop):");

        while (sc.hasNext()) {
            String str = sc.next(); // Read the next string input
            
            // If the input is "RUKOOO" (case-insensitive), break the loop
            if (str.equalsIgnoreCase("RUKOOO")) 
                break;
            
            // Update 'small' if it's null or the new string is lexicographically smaller
            if (small == null || str.compareTo(small) < 0) {
                small = str;
            }
        }
        
        sc.close(); // Close the scanner to prevent resource leaks
        
        // Display the smallest string found
        System.out.println("Smallest element is: " + small);
    }
}
