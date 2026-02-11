package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10810_PuttingBall {
    /*
    자료구조: 배열
    시간복잡도: O(NM)
    공간복잡도: O(N)
    수도코드:
    ```
    N, M 저장하기;
    M만큼 반복하면서
        token[0]부터 token[1]까지 반복하면서
            token[2]를 할당한다
    배열을 공백으로 구분해 출력한다
    ```
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int[] arr = new int[N];
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            for (int j = x; j <= y; j++) {
                arr[j - 1] = z;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}

