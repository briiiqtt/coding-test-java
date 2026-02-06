package baekjoon;
/*
M = readLine()
N = readLine()

1. M<= X <= N
2. X는 소수일 것

을 만족하는 X가 없으면
    print(-1)
있으면
    println(모든 X의 합)
    println(모든 X 중 최소값)
 */

import java.util.Scanner;

public class B2581_PrimeNumber {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int min = 0;
        int sum = 0;

        for (int num = M; num <= N; num++) {
            if (num < 2) continue;

            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
                if (min == 0) min = num;
            }
        }

        if (sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
