package GFG_SHEET_JAVA.Number_System;

import java.util.*;

public class ClimbStairs {
    // Public method to start the recursion with memoization
    public static int climbstairs(int n) {
        // HashMap to store computed results for memoization
        HashMap<Integer, Integer> memo = new HashMap<>();
        return climb(n, memo); // Calls helper function
    }

    // Private recursive function with memoization
    private static int climb(int n, Map<Integer, Integer> memo) {
        // Base cases:
        // If there are 0 or 1 steps left, there's only 1 way to climb.
        if (n == 0 || n == 1) {
            return 1;
        }

        // If result for n steps is not already calculated, compute it.
        if (!memo.containsKey(n)) {
            // Recursive relation: Total ways to climb `n` stairs =
            // Ways to climb `n-1` stairs + Ways to climb `n-2` stairs
            memo.put(n, climb(n - 1, memo) + climb(n - 2, memo));
        }

        // Return the stored result from memoization map
        return memo.get(n);
    }

    // Main method to test the function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
        System.out.println("Ways to climb " + n + " stairs: " + climbstairs(n));
        sc.close();
    }
}
