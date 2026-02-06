package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10811_ReversingBaskets {
    /*
    자료구조: 배열
    시간복잡도: O(NM)
    공간복잡도: O(N)
    수도코드:
    ```
    n, m = read();
    arr[n];
    for 1..m
        i, j = read();
        while(i<j)
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
            i++;

    print(arr);
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

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String[] IJ = br.readLine().split(" ");
            int I = Integer.parseInt(IJ[0]) - 1;
            int J = Integer.parseInt(IJ[1]) - 1;

            while (I < J) {
                int temp = arr[I];
                arr[I] = arr[J];
                arr[J] = temp;
                I++;
                J--;
            }
        }

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
