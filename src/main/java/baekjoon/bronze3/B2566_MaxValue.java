package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2566_MaxValue {
    /*
    자료구조: 정수
    시간복잡도: O(9^2)면 상수시간이니까 O(1)
    공간복잡도: O(1)
    수도코드:
    ```
    max = 0
    x = 0
    y = 0

    FOR i = 0 TO 8:
        FOR j = 0 TO 8:
            v = getTokenizedNum(i, j)
            IF max < v:
                max = v
                x = i
                y = j
            ENDIF
        ENDFOR
    ENDFOR

    print(max + "\n" + x + " " + y)
    ```
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0, x = 0, y = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int v = Integer.parseInt(st.nextToken());
                if (max < v) {
                    max = v;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max + "\n" + (x + 1) + " " + (y + 1));
    }
}
