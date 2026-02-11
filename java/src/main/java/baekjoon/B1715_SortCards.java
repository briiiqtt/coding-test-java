package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B1715_SortCards {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        int compared = 0;
        while (!pq.isEmpty()) {
            int cards = pq.poll();

            if (pq.isEmpty()) break;

            cards += pq.poll();
            pq.offer(cards);

            compared += cards;
        }

        System.out.println(compared);
    }
}
