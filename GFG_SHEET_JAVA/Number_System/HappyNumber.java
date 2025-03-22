package GFG_SHEET_JAVA.Number_System;

public class HappyNumber {
    public boolean isHappy(int n) {
        // If n becomes 1 or 7, it is a happy number (all happy numbers end in 1 or 7)
        if (n == 1 || n == 7) return true;

        // If n is a single-digit number other than 1 or 7, it is not a happy number
        else if (n < 10) return false;

        else {
            int sum = 0;
            // Calculate the sum of squares of digits
            while (n != 0) {
                int temp = n % 10; // Extract the last digit
                sum += Math.pow(temp, 2); // Add its square to sum
                n = n / 10; // Remove the last digit
            }
            // Recursively call the function with the new sum
            return isHappy(sum);
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        HappyNumber happy = new HappyNumber();
        
        System.out.println("Is 19 a Happy Number? " + happy.isHappy(19)); // True (Happy Number)
        System.out.println("Is 2 a Happy Number? " + happy.isHappy(2));   // False (Not a Happy Number)
        System.out.println("Is 7 a Happy Number? " + happy.isHappy(7));   // True (Happy Number)
    }
}
