package baekjoon.silver2;
/*
누적합이 N/2를 넘는 순간이 중앙값이라는 생각을 못했다.
다시 해보자.
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
        int[] arr = new int[N];
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        int[] counts = new int[8001];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
            counts[num + 4000] += 1;
            if (minVal > num) minVal = num;
            if (maxVal < num) maxVal = num;
        }

        int maxCnt = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCnt) {
                maxCnt = counts[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxCnt) list.add(i - 4000);
        }

        int mostNumerous = list.size() > 1 ? list.get(1) : list.get(0);

        Arrays.sort(arr);
        float avg = (float) sum / N;
        int mid = arr[arr.length / 2];

        System.out.println(Math.round(avg));
        System.out.println(mid);
        System.out.println(mostNumerous);
        System.out.println(maxVal - minVal);
    }
}