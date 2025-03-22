package GFG_SHEET_JAVA.Number_System;

public class PerfectNumber {
    public static boolean isPerfect(int n ) {
        int sum=0;
        for(int i=1;i<n;i++) {
            if(n%i==0) {
                sum+=i;
            }
        }
        return sum==n;
    }

    public static void main(String args[]) {
        System.out.println("Perfect Number:"+isPerfect(28));
    }
    
}
