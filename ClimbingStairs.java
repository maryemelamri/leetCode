class Solution {
    public int climbStairs(int n) {
        //si b9at lih deja whd aytla3 b wahed
        if (n == 1)
            return 1;
        //ba9a lih 2 
        int[] dp = new int[n + 1];
    
        dp[1] = 1;
        dp[2] = 2;
       
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
