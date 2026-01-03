package baekjoon.bronze5;
/*
자료구조: 정수64
시간복잡도: O(N)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B27433_Factorial2 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fac(N));
    }

    static long fac(int num) {
        if (num <= 1) return 1;
        return num * fac(num - 1);
    }
}
