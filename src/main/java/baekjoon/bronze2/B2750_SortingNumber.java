package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750_SortingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = Integer.parseInt(br.readLine());

        int[] countingArr = new int[2001];
        for (int i = 0; i < lineCount; i++) {
            int num = Integer.parseInt(br.readLine()) + 1000;
            countingArr[num]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countingArr.length; i++) {
            int count = countingArr[i];
            while (count-- > 0) {
                sb.append(i - 1000).append("\n");
            }
        }

        System.out.println(sb);
    }
}
