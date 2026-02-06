package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10807_Counting {
    /*
    자료구조: 배열
    시간복잡도: O(n)
    공간복잡도: O(1)
    수도코드:
    ```
    N 입력받기;
    라인 입력받고 토큰화;
    V 입력받기;
    토큰 하나씩 읽으면서 V랑 비교, 같으면 카운트++;
    ```
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int V = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) == V) cnt++;
        }

        System.out.println(cnt);
    }
}
