package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Deokguk {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] countingArr = new int[50000];
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            countingArr[n - 1]++;
        }

        int max = 0;
        for (int i = 0; i < countingArr.length; i++) {
            int c = countingArr[i];
            if (max < c) max = c;
        }

        System.out.println(max);
    }
}
