package baekjoon.bronze2;
/*
자료구조: 정수32
시간복잡도: O(N)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870_Fibonacci {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(fibo(0, 1, N));
    }

    static int fibo(int a, int b, int N) {
        if (N == 0) return a;
        if (N <= 2) return a + b;
        return fibo(b, (a + b), N - 1);
    }
}
