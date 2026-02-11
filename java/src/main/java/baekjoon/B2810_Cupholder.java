package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2810_Cupholder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String line = br.readLine();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (line.charAt(i) == 'L') i++;
            cnt++;
        }
        cnt++;
        System.out.println(Math.min(line.length(), cnt));
    }
}
