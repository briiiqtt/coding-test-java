package baekjoon.silver4;
/*
자료구조: Map
시간복잡도: O(N+M)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B10816_NumberCards2 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        var cards = new StringTokenizer(br.readLine());
        br.readLine();
        var checks = new StringTokenizer(br.readLine());

        var map = new HashMap<Integer, Integer>();
        while (cards.hasMoreTokens()) {
            int num = Integer.parseInt(cards.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        var sb = new StringBuilder();
        while (checks.hasMoreTokens()) {
            int num = Integer.parseInt(checks.nextToken());
            sb.append(map.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
