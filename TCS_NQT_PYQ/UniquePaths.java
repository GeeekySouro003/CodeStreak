public class UniquePaths {
    
    // Recursive function with memoization to find unique paths
    public static int move(int i, int j, int[][] dp) {
        // Base case: If we reach the top-left corner, there is one unique path
        if (i == 0 && j == 0) return 1;

        // If we go out of bounds, return 0 as it's not a valid path
        if (i < 0 || j < 0) return 0;

        // If the result is already computed, return the stored value (Memoization)
        if (dp[i][j] != -1) return dp[i][j];

        // Move up (decrease row index)
        int up = move(i - 1, j, dp);
        
        // Move left (decrease column index)
        int left = move(i, j - 1, dp);

        // Store the total number of ways to reach this cell
        dp[i][j] = up + left;

        return dp[i][j];
    }

    // Function to compute unique paths from (0,0) to (m-1,n-1)
    public int unique(int m, int n) {
        // Create a DP table initialized with -1
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        // Start computation from the bottom-right corner (m-1, n-1)
        return move(m - 1, n - 1, dp);
    }
}
