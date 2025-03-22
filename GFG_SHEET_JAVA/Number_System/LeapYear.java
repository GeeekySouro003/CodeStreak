package GFG_SHEET_JAVA.Number_System;

class LeapYear {
    static boolean isLeap(int n) {
        // A year is a leap year if:
        // 1. It is divisible by 4 AND
        // 2. (It is divisible by 400 OR It is NOT divisible by 100)
        if ((n % 4 == 0) && (n % 400 == 0 || n % 100 != 0))  
            return true;
        else  
            return false;
    }

    public static void main(String args[]) {
        System.out.println(isLeap(4)); // Testing for year 4
    }
}
