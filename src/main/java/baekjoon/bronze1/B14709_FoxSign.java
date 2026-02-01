package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14709_FoxSign {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[] b = new boolean[3];

        if (N == 3) {
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int finger1 = Integer.parseInt(st.nextToken());
                int finger2 = Integer.parseInt(st.nextToken());

                if (finger1 == 1 && finger2 == 3 || finger1 == 3 && finger2 == 1) {
                    b[0] = true;
                } else if (finger1 == 1 && finger2 == 4 || finger1 == 4 && finger2 == 1) {
                    b[1] = true;
                } else if (finger1 == 4 && finger2 == 3 || finger1 == 3 && finger2 == 4) {
                    b[2] = true;
                }
            }
        }

        System.out.println(b[0] && b[1] && b[2] ? "Wa-pa-pa-pa-pa-pa-pow!" : "Woof-meow-tweet-squeek");
    }
}
