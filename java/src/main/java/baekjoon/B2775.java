package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775 {
    static int getCount(int k, int n) {
        if (k == 0 || n == 1) {
            return n;
        }

        int r = 0;
        for (int i = 0; i < n; i++) {
            r += getCount(k - 1, n - i);
        }
        return r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            if (sb.length() > 0) sb.append("\n");
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(getCount(k, n));
        }
        System.out.println(sb);
    }
}
