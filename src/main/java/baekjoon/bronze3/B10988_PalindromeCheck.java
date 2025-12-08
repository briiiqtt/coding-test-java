package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988_PalindromeCheck {
    /*
    자료구조: 문자열
    시간복잡도: O(n)
    공간복잡도: O(n)
    수도코드:
    ```
    str = read();
    print(str.equals(reverse(str)));
    ```
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringBuilder sb = new StringBuilder(S);
        System.out.println(S.equals(sb.reverse().toString()) ? 1 : 0);
    }
}
