class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        // Create a DP array for 100 rows
        double[][] dp = new double[101][101];
        
        // Pour all champagne into the top glass
        dp[0][0] = poured;
        
        // Fill row by row
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                // If current glass overflows
                if (dp[i][j] > 1.0) {
                    double excess = (dp[i][j] - 1.0) / 2.0;
                    dp[i + 1][j] += excess;
                    dp[i + 1][j + 1] += excess;
                    dp[i][j] = 1.0; // Cap current glass at 1
                }
            }
        }
        
        return dp[query_row][query_glass];
    }
}