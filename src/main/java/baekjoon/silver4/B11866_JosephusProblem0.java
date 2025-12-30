package baekjoon.silver4;
/*
자료구조: 연결리스트
시간복잡도: O(N^2)
공간복잡도: O(N)

순환 연결리스트를 생각하고 풀다가 노선을 틀었더니 이도저도 아니게 됐다.
절대 링크드리스트에서 인덱스를 쓰지마
기록 목적으로 남겨둔다
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B11866_JosephusProblem0 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        var list = new LinkedList<Integer>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        var sb = new StringBuilder("<");
        int idx = -1;
        while (!list.isEmpty()) {
            for (int i = 0; i < K; i++) {
                idx += 1;
                if (idx >= list.size()) idx = 0;
            }
            sb.append(list.remove(idx)).append(", ");
            idx -= 1;
        }

        System.out.println(sb.substring(0, sb.length() - 2) + ">");
    }

}
