package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1202_JewelThief {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());


        long[][] jewels = new long[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            jewels[i][0] = Long.parseLong(st2.nextToken());
            jewels[i][1] = Long.parseLong(st2.nextToken());
        }

        Arrays.sort(jewels, (a, b) -> {
            if (a[0] != b[0]) {
                return Long.compare(a[0], b[0]);
            }
            return Long.compare(b[1], a[1]);
        });

        int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(bags);

        long sum = 0;
        int j = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < bags.length; i++) {
            int bag = bags[i];

            while (j < jewels.length && jewels[j][0] <= bag) {
                pq.offer(jewels[j][1]);
                j++;
            }

            if (!pq.isEmpty()) sum += pq.poll();
        }

        System.out.println(sum);
    }
}
