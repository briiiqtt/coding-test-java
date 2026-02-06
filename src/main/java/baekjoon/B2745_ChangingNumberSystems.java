package baekjoon;
/*
자료구조: 정수, 문자
시간복잡도: O(N)
공간복잡도: O(1)
수도코드:
```
t = readLine().split(" ")
n = t[0]
b = t[1]
sum = 0

FUNCTION toDigit(p):
    IF p > '9': RETURN 10 + p - 'A'
    ELSE RETURN p - '0'

FOR i = n.length - 1 TO 0 STEP -1:
    sum += toDigit(n[i]) * b^(n.length - 1 - i)
ENDFOR

print(sum)
```
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2745_ChangingNumberSystems {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var t = br.readLine().split(" ");

        String n = t[0];
        int b = Integer.parseInt(t[1]);
        int sum = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            sum += toDigit(n.charAt(i)) * (int) Math.pow(b, n.length() - 1 - i);
        }

        System.out.println(sum);
    }

    public static int toDigit(char n) {
        if (n > '9') return 10 + n - 'A';
        else return n - '0';
    }

}
