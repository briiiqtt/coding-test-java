package baekjoon;
/*
자료구조: 정수
시간복잡도: O(T * log min(A, B))
공간복잡도: O(1)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1934_LCM {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        var sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            var st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int x = Math.max(A, B);
            int y = Math.min(A, B);

            while (x != 0 && y != 0) {
                int r = x % y;
                x = y;
                y = r;
            }

            int gcd = Math.max(x, y);

            sb.append(A * B / gcd).append("\n");
        }

        System.out.println(sb);
    }
}
