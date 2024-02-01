class Solution {
        public int coinChange(int[] coins, int amount) {
        final int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int a=1; a<dp.length; a++) {
            for (int c=0; c<coins.length; c++) {
                if (coins[c] <= a && dp[a - coins[c]] != Integer.MAX_VALUE) {
                    dp[a] = Math.min(dp[a], 1 + dp[a - coins[c]]);
                }
            }
        }
        return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1;
    }
    
}
