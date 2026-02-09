package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11047_Coin0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        while (K > 0) {
            for (int i = N - 1; i >= 0; i--) {
                if (coins[i] <= K) {
                    K -= coins[i];
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
