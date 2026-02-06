package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B33835_Road {
    public static void main(String[] args) throws IOException {
        /*
        sqrt((a-c)^2+(b-d)^2)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long a = 0, b = 0, c = 0, d = 0;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if (i == 0) {
                StringTokenizer st = new StringTokenizer(line);
                a = Long.parseLong(st.nextToken());
                b = Long.parseLong(st.nextToken());
            } else if (i == N - 1) {
                StringTokenizer st = new StringTokenizer(line);
                c = Long.parseLong(st.nextToken());
                d = Long.parseLong(st.nextToken());
            }
        }


        double r = Math.sqrt((a - c) * (a - c) + (b - d) * (b - d));
        System.out.println(r);
    }
}
