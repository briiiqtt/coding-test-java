package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        char[][] chars = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                chars[i][j] = line.charAt(j);
            }
        }

        String num = br.readLine();
        StringBuilder sb = new StringBuilder();
        if (num.equals("1")) {
            for (int i = 0; i < N; i++) {
                if (i > 0) sb.append("\n");
                for (int j = 0; j < N; j++) {
                    sb.append(chars[i][j]);
                }
            }
        } else if (num.equals("2")) {
            for (int i = 0; i < N; i++) {
                if (i > 0) sb.append("\n");
                for (int j = N - 1; j >= 0; j--) {
                    sb.append(chars[i][j]);
                }
            }
        } else if (num.equals("3")) {
            for (int i = N - 1; i >= 0; i--) {
                if (i < N - 1) sb.append("\n");
                for (int j = 0; j < N; j++) {
                    sb.append(chars[i][j]);
                }
            }
        }
        System.out.println(sb);
    }
}
