package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750_SortingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] countingArr = new int[2001];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            int idx = num + 1000;
            countingArr[idx] += 1;
        }

        var sb = new StringBuilder();
        for (int i = 0; i < countingArr.length; i++) {
            for (int j = 0; j < countingArr[i]; j++) {
                sb.append(i - 1000).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}
