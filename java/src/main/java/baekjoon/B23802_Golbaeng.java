package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B23802_Golbaeng {
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int cell = 5;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N * cell; j++) {
                sb.append("@");
            }
            sb.append("\n");
        }

        for (int i = 0; i < cell * N - N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append("@");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
