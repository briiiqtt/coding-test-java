package baekjoon;

import java.util.Scanner;

public class B11653_PrimeFactorization {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        if (N < 2) return;

        var sb = new StringBuilder();
        for (int i = 2; i <= N; i++) {
            // i 로 나눠지면 계속 i로 나누고, i를 append
            while (N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }

        System.out.println(sb);
    }
}
