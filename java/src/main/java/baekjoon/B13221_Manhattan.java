package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13221_Manhattan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int meX = Integer.parseInt(st.nextToken());
        int meY = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        int[] loc = new int[2];
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int taxiX = Integer.parseInt(st2.nextToken());
            int taxiY = Integer.parseInt(st2.nextToken());

            int distance = Math.abs(meX - taxiX) + Math.abs(meY - taxiY);
            if (distance > minDistance) continue;
            minDistance = distance;
            loc[0] = taxiX;
            loc[1] = taxiY;
        }

        System.out.println(loc[0] + " " + loc[1]);
    }
}
