package baekjoon.bronze3;
/*
자료구조: 정수
시간복잡도: O(T)
공간복잡도: O(1)
수도코드:
```
T = toInt(readLine())

FOR i = 0 TO T - 1:
    c = toInt(readLine())

    q = c / 25
    c = c % 25

    d = c / 10
    c = c % 10

    n = c / 5
    c = c % 5

    p = c

    print(q, d, n, p)
ENDFOR
```
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2720_LaundryMan {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        var sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int c = Integer.parseInt(br.readLine());

            int q = c / 25;
            c = c % 25;

            int d = c / 10;
            c = c % 10;

            int n = c / 5;
            c = c % 5;

            int p = c;

            sb.append(q + " " + d + " " + n + " " + p + "\n");
        }

        System.out.println(sb);
    }
}
