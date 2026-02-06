package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436_MovieDirectorShom {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int i = 0;
        while (cnt < N) {
            ++i;
            if (String.valueOf(i).contains("666")) {
                ++cnt;
            }
        }

        System.out.println(i);
    }
}
