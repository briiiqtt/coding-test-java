package baekjoon;
/*
자료구조: 스택, 큐
시간복잡도: O(N+M)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class B24511_Queuestack {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        var structures = new StringTokenizer(br.readLine());
        var existingData = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        var newData = new StringTokenizer(br.readLine());

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(existingData.nextToken());
            boolean isQueue = structures.nextToken().equals("0");
            if (isQueue) queue.offerFirst(n);
        }
        var sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            queue.offer(Integer.parseInt(newData.nextToken()));
            sb.append(queue.poll()).append(" ");
        }

        System.out.println(sb);
/*
        ArrayList<Queuestack> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new Queuestack(structures.nextToken().equals("0"), Integer.parseInt(existingData.nextToken())));
        }

        var sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int nextVal = Integer.parseInt(newData.nextToken());
            for (int j = 0; j < N; j++) {
                Queuestack cur = list.get(j);
                if (cur.isQueue) {
                    int temp = cur.value;
                    cur.value = nextVal;
                    nextVal = temp;
                }
            }
            sb.append(nextVal).append(" ");
        }

        System.out.println(sb);
    }

    static class Queuestack {
        boolean isQueue;
        int value;

        Queuestack(boolean isQueue, int value) {
            this.isQueue = isQueue;
            this.value = value;
        }
    }
 */
    }
}