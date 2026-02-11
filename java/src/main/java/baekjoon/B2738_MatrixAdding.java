package baekjoon;
/*
자료구조: 2차원 배열
시간복잡도: O(NM)
공간복잡도: O(NM)
수도코드:
```
s = tokenize(readLine())
x = toInt(s[0])
y = toInt(s[1])
arr = new array[x][y]

FOR i = 0 TO x - 1:
    FOR j = 0 TO y - 1:
        l = tokenize(readLine())
        arr[i][j] = toInt(l[j])
    ENDFOR
ENDFOR

sb = new StringBuilder()

FOR i = 0 TO x - 1:
    FOR j = 0 TO y - 1:
        l = tokenize(readLine())
        sb.append(arr[i][j] + toInt(l[j])).append(" ")
    ENDFOR
    sb.append("\n")
ENDFOR

print(sb)
```
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2738_MatrixAdding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[][] arr = new int[x][y];

        for (int i = 0; i < x; i++) {
            StringTokenizer line = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                arr[i][j] = Integer.parseInt(line.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            StringTokenizer line = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                sb.append(arr[i][j] + Integer.parseInt(line.nextToken())).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
