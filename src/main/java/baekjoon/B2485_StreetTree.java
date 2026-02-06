package baekjoon;
/*
자료구조: 정수
시간복잡도: O(N log M), M = 나무 최대 거리
공간복잡도: O(1)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2485_StreetTree {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int prev = Integer.parseInt(br.readLine());
        int start = prev;

        int gcd = 0;
        for (int i = 0; i < N - 1; i++) {
            int cur = Integer.parseInt(br.readLine());
            gcd = gcd == 0 ? cur - prev : gcd(gcd, cur - prev);
            prev = cur;
        }

        System.out.println((prev - start) / gcd - N + 1);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
