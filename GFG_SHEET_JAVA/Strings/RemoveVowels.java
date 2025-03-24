package GFG_SHEET_JAVA.Strings;  

import java.util.Scanner;  

public class RemoveVowels {     

    // Method to remove vowels from the given string
    public static String remove(String s) {         
        StringBuilder res = new StringBuilder(); // Using StringBuilder for efficient string modification
        
        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {             
            // Check if the character is not a vowel
            if ("aeiouAEIOU".indexOf(ch) == -1) {                 
                res.append(ch); // Append non-vowel characters to result
            }         
        }         
        return res.toString(); // Return the modified string without vowels
    }     

    public static void main(String[] args) {         
        Scanner sc = new Scanner(System.in); // Scanner object to take input from the user
        
        System.out.print("Enter a string: ");
        String S = sc.next(); // Read user input
        
        System.out.println("String after removing vowels: " + remove(S)); // Display result
        
        sc.close(); // Close scanner to prevent resource leak
    } 
}
