package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5597_WhoDidNotDoHomework {
    /*
    자료구조: 정수
    시간복잡도: O(N)
    공간복잡도: O(1)
    수도코드:
    ```
    4바이트 정수형 비트플래그 a를 선언한다.
    28회 반복 {
        입력 n을 읽고
        a |= (1 << (n - 1))한다
    }

    30회 반복 {
        (a & (1 << i)) == 0이면 i+1을 출력한다
    ```
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            a |= (1 << (n - 1));
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 30; i++) {
            if ((a & (1 << i)) == 0) {
                sb.append(i + 1).append("\n");
            }
        }

        System.out.println(sb);
    }
}
