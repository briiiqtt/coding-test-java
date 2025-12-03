package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10813_ChangingBalls {
    /*
    자료구조: 배열
    시간복잡도: O(N+M)
    공간복잡도: O(N)
    수도코드:
    ```
    N과 M 입력받기
    N만큼 반복하며 배열1의 모든 요소에 각각 인덱스+1을 할당하기
    M만큼 반복하며 입력을 읽고 배열1의 인덱스 token[0]과 token[1]의 값을 교환하기
    배열1을 순회하며 요소를 공백으로 구분해 출력하기
    ```
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);

            int temp = arr[x - 1];
            arr[x - 1] = arr[y - 1];
            arr[y - 1] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
