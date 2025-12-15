package baekjoon.bronze1;
/*
자료구조: 정수, 문자, 문자열
시간복잡도: O(N)
공간복잡도: O(1)
수도코드:
```
t = readLine().split(" ")
n = toInt(t[0])
b = toInt(t[1])

FUNCTION toB(p):
    IF p > '9': RETURN 'A' + p - 10
    ELSE RETURN p

sb = new StringBuilder()

WHILE n != 0:
    sb.prepend(toB(n % b))
    n /= b
ENDWHILE

print(sb.reverse())
```
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11005_ChangingNumberSystems2 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var t = br.readLine().split(" ");
        int n = Integer.parseInt(t[0]);
        int b = Integer.parseInt(t[1]);

        var sb = new StringBuilder();

        while (n != 0) {
            sb.append(toB(n % b));
            n /= b;
        }

        System.out.println(sb.reverse());
    }

    public static char toB(int p) {
        if (p > 9) return (char) ('A' + p - 10);
        else return (char) ('0' + p);
    }
}
