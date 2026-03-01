package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1463 {
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int[] dp = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            int x = dp[i - 1] + 1;
            if (i % 3 == 0) x = Math.min(x, dp[i / 3] + 1);
            if (i % 2 == 0) x = Math.min(x, dp[i / 2] + 1);
            dp[i] = x;
        }

        System.out.println(dp[dp.length - 1]);
    }
}
