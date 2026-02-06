package baekjoon;
/*
자료구조: 2차원 배열
시간복잡도: O(NM)
공간복잡도: O(NM)
수도코드:
```
n = toInt(readLine())

arr = new array[100][100]

FOR i = 0 TO n - 1:
    tokens = tokenize(readLine())
    x = tokens.next()
    y = tokens.next()

    FOR j = x TO x + 10:
        FOR k = y TO y + 10:
            arr[j][k] = true
        ENDFOR
    ENDFOR
ENDFOR

cnt = 0

FOR EACH a IN arr:
    FOR EACH b IN a:
        IF b:
            cnt++
        ENDIF
    ENDFOR
ENDFOR
```
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2563_ColoredPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[][] arr = new boolean[100][100];

        for (int i = 0; i < n; i++) {
            StringTokenizer tokens = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(tokens.nextToken());
            int y = Integer.parseInt(tokens.nextToken());

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    arr[j][k] = true;
                }
            }
        }

        int cnt = 0;
        for (boolean[] a : arr) {
            for (boolean b : a) {
                if (b) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
