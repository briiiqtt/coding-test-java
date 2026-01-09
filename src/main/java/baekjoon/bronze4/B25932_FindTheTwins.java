package baekjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25932_FindTheTwins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            boolean mack = line.contains("18");
            boolean zack = line.contains("17");
            String msg = mack && zack ? "both" : mack ? "mack" : zack ? "zack" : "none";
            if (0 < sb.length()) sb.append("\n\n");
            sb.append(line).append("\n").append(msg);
        }
        System.out.println(sb);
    }
}
