package baekjoon.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2447_Star10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[][] arr = new char[N][N];
        for (char[] chars : arr) {
            Arrays.fill(chars, ' ');
        }

        f(arr, 0, 0, N);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void f(char[][] arr, int x, int y, int size) {
        if (size == 1) {
            arr[x][y] = '*';
            return;
        }

        size /= 3;
        for (int i = 0; i < 9; i++) {
            if (i == 4) continue;
            f(arr, x + size * (i / 3), y + size * (i % 3), size);
        }
    }
}
