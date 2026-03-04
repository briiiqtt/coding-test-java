package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][n];
        dp[0][0] = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                int next = Integer.parseInt(st.nextToken());
                if (j != 0 && j != i) {
                    int larger = Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
                    dp[i][j] = larger + next;
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + next;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + next;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < dp[n - 1][i]) max = dp[n - 1][i];
        }

        System.out.println(max);
    }
}
