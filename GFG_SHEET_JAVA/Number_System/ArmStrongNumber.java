package GFG_SHEET_JAVA.Number_System;

public class ArmStrongNumber {
    public static boolean checkNumber(int n) {
        int tempo = n; // Store original number for later comparison
        int temp;
        int sum = 0;

        while (n != 0) {
            temp = n % 10; // Extract last digit
            sum += Math.pow(temp, 3); // Fix: Cube of the extracted digit, not n
            n = n / 10; // Remove last digit
        }

        return sum == tempo; // Check if sum matches original number
    }

    public static void main(String args[]) {
        int number = 153;
        if (checkNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
