package com.problems.array.practice;

public class NewTest {
    public static int countArrangements(int N, int K) {
        int MOD = 1000000007;
        int[][] dp = new int[N+1][K];
        for (int j = 0; j < K; j++) {
            dp[1][j] = 1;
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < K; j++) {
                int sum = 0;
                for (int k = 0; k < K; k++) {
                    if (k != j) {
                        sum = (sum + dp[i-1][k]) % MOD;
                    }
                }
                dp[i][j] = (sum - dp[i-1][j] + MOD) % MOD;
            }
        }
        int ans = 0;
        for (int j = 0; j < K; j++) {
            ans = (ans + dp[N][j]) % MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countArrangements(2,3));
    }
}
