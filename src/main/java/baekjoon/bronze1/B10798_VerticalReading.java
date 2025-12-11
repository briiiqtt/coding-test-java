package baekjoon.bronze1;
/*
자료구조: 2차원 배열
시간복잡도: O(1)
공간복잡도: O(1)
수도코드:
```
arr = new array[5][]

FOR i = 0 TO 4:
    line = readLine()
    arr[i] = new array[line]
    FOR j = 0 TO line.length - 1:
        arr[i][j] = line.charAt(j)
    ENDFOR
ENDFOR

sb = new StringBuilder()

FOR i = 0 TO 14:
    FOR j = 0 TO 4:
        IF arr[j].length > i:
            sb.append(arr[j][i])
        ENDIF
    ENDFOR
ENDFOR

print(sb)
```
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10798_VerticalReading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][];

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            arr[i] = new char[line.length()];
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j].length > i) {
                    sb.append(arr[j][i]);
                }
            }
        }

        System.out.println(sb);
    }
}
