package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3003_KQLVKP {
    /*
    자료구조: 문자열
    시간복잡도: O(1)
    공간복잡도: O(1)
    수도코드:
    ```
    v = {1, 1, 2, 2, 2, 8};
    s = read().split(" ");

    str;
    for (0..5)
        str += v - toNum(s) + " "
    print(str);
    ```
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] v = {1, 1, 2, 2, 2, 8};
        String[] s = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 5; i++) {
            sb.append(v[i] - Integer.parseInt(s[i])).append(" ");
        }

        System.out.println(sb);
    }
}
