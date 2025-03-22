package GFG_SHEET_JAVA.Number_System;

public class LargeNumberDivisibleByNine {
    public static boolean check(String str) { //taking input in string format
        int n=str.length();
        int totalsum=0;
        for(int i=0;i<n;i++) {
            totalsum+=(str.charAt(i)-'0'); //str.charAt(i) - '0' converts a character (e.g., '5') to its integer value (5).
        }
        return(totalsum%9==0);
    }

    public static void main(String args[]) {
        String str="99333";
        if(check(str))
        System.out.println("Divisble");
        else 
        System.out.println("Not Divisble");
    }
}
