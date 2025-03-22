package GFG_SHEET_JAVA.Number_System;

public class FloatingNumberEvenOrOdd {
    public static boolean isEven(String s, int n) { 
        // Find the position of the decimal point
        int decimalIndex = s.indexOf('.');
        
        // Extract the integer part of the number
        String integerPart = (decimalIndex == -1) ? s : s.substring(0, decimalIndex);
        
        // Get the last character of the integer part
        char lastDigit = integerPart.charAt(integerPart.length() - 1);
        
        // Check if the last digit is even or odd
        return (lastDigit - '0') % 2 == 0; // Returns true if even, false if odd
    }


public static void main(String[] args) {

    System.out.println(isEven("123.45", 6));
}
}

