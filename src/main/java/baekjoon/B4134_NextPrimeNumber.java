package baekjoon;
/*
자료구조: 정수
시간복잡도: O(M sqrt(N)), M = N과 N 이후의 소수의 차
공간복잡도: O(1)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4134_NextPrimeNumber {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        var sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());
            long answer = 0;
            while (answer == 0) {
                boolean isPrime = true;
                if (N < 2 || (N != 2 && N % 2 == 0)) isPrime = false;
                else {
                    for (long j = 2; j * j <= N; j++) {
                        if (N % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) answer = N;
                else N++;
            }
            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}
