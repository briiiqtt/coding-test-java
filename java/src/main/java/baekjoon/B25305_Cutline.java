package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B25305_Cutline {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());
        var scores = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] cntArr = new int[N];
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(scores.nextToken());
            cntArr[i] = score;
        }

        Arrays.sort(cntArr);

        System.out.println(cntArr[N - k]);
    }
}
