/*
X<=(X-K)*N
X<=XN-KN
X+KN<=XN
KN<=XN-X
KN<=(N-1)X
KN/N-1<=X
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B23972_DevilSuggestion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long K = Integer.parseInt(st.nextToken());
        long N = Integer.parseInt(st.nextToken());
        if (N < 2) {
            System.out.println(-1);
            return;
        }

        long X = ((K * N) + N - 2) / (N - 1);
        System.out.println(X);
    }
}
