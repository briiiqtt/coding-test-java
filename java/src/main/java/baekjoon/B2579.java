package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N < 3) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += Integer.parseInt(br.readLine());
            }
            System.out.println(sum);
            return;
        }

        int[] dp = new int[N];
        int[] points = new int[N];
        points[0] = Integer.parseInt(br.readLine());
        points[1] = Integer.parseInt(br.readLine());
        dp[0] = points[0];
        dp[1] = points[0] + points[1];

        for (int i = 2; i < N; i++) {
            points[i] = Integer.parseInt(br.readLine());

            int prev = i == 2 ? 0 : dp[i - 3];
            dp[i] = Math.max(dp[i - 2], prev + points[i - 1]) + points[i];
        }

        System.out.println(dp[dp.length - 1]);
    }
}
