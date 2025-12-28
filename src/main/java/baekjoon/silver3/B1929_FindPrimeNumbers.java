package baekjoon.silver3;
/*
자료구조: 정수
시간복잡도: O(N sqrt(N))
공간복잡도: O(1)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929_FindPrimeNumbers {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        var sb = new StringBuilder();
        for (long i = N; i <= M; i++) {
            boolean isPrime = true;
            if (i < 2 || (i != 2 && i % 2 == 0)) {
                isPrime = false;
            } else {
                for (long j = 3; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
