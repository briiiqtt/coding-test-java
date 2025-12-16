package baekjoon.bronze3;
/*
끝까ㅣ지 돌 필요 없이 K번째 만나면 출력하고 종료
 */

import java.util.Scanner;

public class B2501_FindingDivisors {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                if (++count == K) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
