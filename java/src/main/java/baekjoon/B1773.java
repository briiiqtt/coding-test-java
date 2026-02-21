package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] periods = new int[N];
        for (int i = 0; i < N; i++) {
            periods[i]= Integer.parseInt(br.readLine());
        }
        int explodeCount = 0;
        for (int i = 1; i <= C; i++) {
            for (int j = 0; j < periods.length; j++) {
               if (i % periods[j] == 0) {
                   explodeCount++;
                   break;
               }
            }
        }
        System.out.println(explodeCount);
    }
}
