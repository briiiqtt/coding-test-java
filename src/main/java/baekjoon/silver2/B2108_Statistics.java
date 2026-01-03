package baekjoon.silver2;
/*
계수배열에서 계수를 누적시키고, 누적값이 N/2를 넘어서는 순간의 인덱스가 중간값임.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2108_Statistics {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        int[] counts = new int[8001];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            counts[num + 4000] += 1;
            if (minVal > num) minVal = num;
            if (maxVal < num) maxVal = num;
            sum += num;
        }

        Integer mid = null;
        int cntAcc = 0;
        int maxCnt = 0;
        for (int i = 0; i < counts.length; i++) {
            int cnt = counts[i];
            if (cnt > maxCnt) {
                maxCnt = counts[i];
            }
            cntAcc += cnt;
            if (cntAcc > N / 2 && mid == null) mid = i - 4000;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxCnt) list.add(i - 4000);
        }

        int mostNumerous = list.size() > 1 ? list.get(1) : list.get(0);

        float avg = (float) sum / N;

        System.out.println(Math.round(avg));
        System.out.println(mid);
        System.out.println(mostNumerous);
        System.out.println(maxVal - minVal);
    }
}