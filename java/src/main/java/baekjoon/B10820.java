package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            char[] arr = line.toCharArray();
            int[] cnts = new int[4];
            for (int i = 0; i < arr.length; i++) {
                char c = arr[i];
                if ('a' <= c && c <= 'z') cnts[0] += 1;
                else if ('A' <= c && c <= 'Z') cnts[1] += 1;
                else if ('0' <= c && c <= '9') cnts[2] += 1;
                else cnts[3] += 1;
            }
            sb.append(cnts[0]).append(" ").append(cnts[1]).append(" ").append(cnts[2]).append(" ").append(cnts[3]).append(" ").append("\n");
        }
        System.out.println(sb);
    }
}
