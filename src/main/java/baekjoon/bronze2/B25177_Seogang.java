package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25177_Seogang {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int maxDiff = 0;
        for (int i = 0; i < Math.max(N, M); i++) {
            int pointPrev = 0, pointNow = 0;
            if (st2.hasMoreTokens()) {
                pointNow = Integer.parseInt(st2.nextToken());
            }
            if (st3.hasMoreTokens()) {
                pointPrev = Integer.parseInt(st3.nextToken());
            }

            int diff = pointPrev - pointNow;
            if (maxDiff < diff) maxDiff = diff;
        }
        System.out.println(maxDiff);
    }
}
