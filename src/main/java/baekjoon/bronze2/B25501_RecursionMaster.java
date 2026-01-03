package baekjoon.bronze2;
/*
자료구조: 정수32, 배열
시간복잡도: O(N*s.length)
공간복잡도: O(s.length)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25501_RecursionMaster {
    public static int recursion(String s, int l, int r, int[] cnt) {
        cnt[0] += 1;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1, cnt);
    }

    public static int isPalindrome(String s, int[] cnt) {
        return recursion(s, 0, s.length() - 1, cnt);
    }

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int[] cnt = new int[1];
            String s = br.readLine();
            sb.append(isPalindrome(s, cnt)).append(" ").append(cnt[0]).append("\n");
        }

        System.out.println(sb);
    }
}
