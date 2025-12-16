package baekjoon.bronze1;
/*
자료구조: 정수, 문자열
시간복잡도: O(N)
공간복잡도: O(1)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9506_SumOfDivisors {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("-1")) {
            int N = Integer.parseInt(line);
            var sb = new StringBuilder(N + " = ");

            int sum = 0;
            for (int i = 1; i <= N / 2; i++) {
                if (N % i == 0) {
                    sb.append(i).append(" + ");
                    sum += i;
                }
            }

            if (sum == N) System.out.println(sb.substring(0, sb.length() - 3));
            else System.out.println(N + " is NOT perfect.");
        }
    }
}
