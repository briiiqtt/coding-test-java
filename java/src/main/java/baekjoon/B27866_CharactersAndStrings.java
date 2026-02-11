package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B27866_CharactersAndStrings {
    /*
    자료구조: 문자열
    시간복잡도: O(1)
    공간복잡도: O(N)
    수도코드:
    ```
    S = read();
    i = read();
    print(S[i]);
    ```
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(S.charAt(i - 1));
    }
}
