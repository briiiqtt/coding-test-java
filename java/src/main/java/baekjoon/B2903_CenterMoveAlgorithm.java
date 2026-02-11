package baekjoon;
/*
자료구조: 정수
시간복잡도: O(N)
공간복잡도: O(1)
수도코드:
```
N = readInt()

d = 4
FOR i = 0 TO N - 1:
    d = d * 2 - 1;
ENDFOR

print(d^2)
```
 */

import java.io.IOException;
import java.util.Scanner;

public class B2903_CenterMoveAlgorithm {
    public static void main(String[] args) throws IOException {
        var sc = new Scanner(System.in);
        int N = sc.nextInt();

        int d = 2;
        for (int i = 0; i < N; i++) {
            d = d * 2 - 1;
        }

        System.out.println(d * d);
    }
}
