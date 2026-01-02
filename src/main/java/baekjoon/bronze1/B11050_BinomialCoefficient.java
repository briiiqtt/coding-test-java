package baekjoon.bronze1;
/*
NCK = NPK / K!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11050_BinomialCoefficient {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int C = 1;
        for (int i = 0; i < K; i++) {
            C *= N - i;
        }

        int fac = 1;
        for (int i = 2; i <= K; i++) {
            fac *= i;
        }

        System.out.println(C / fac);
    }
}
