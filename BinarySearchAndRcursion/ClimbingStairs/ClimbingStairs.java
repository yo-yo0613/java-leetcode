package BinarySearchAndRcursion.ClimbingStairs;

public class ClimbingStairs {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5; // 5 階
        System.out.println("爬 " + n + " 階的方法數: " + sol.climbStairs(n)); // 預期: 8
    }    
}

class Solution {
    public int climbStairs(int n) {
        // 1. 基礎判斷：1 階只有 1 種，2 階有 2 種
        if (n <= 2) return n; 

        // 2. 建立一個陣列來存每一階的方法數 (這就是 DP Table)
        int[] dp = new int[n + 1];
        dp[1] = 1; // 1 階
        dp[2] = 2; // 2 階

        // 3. 從第 3 階開始往上填表
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n]; // 最後回傳 n 階的方法數
    }
}
