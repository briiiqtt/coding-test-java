package nadongbin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Icecream {
    static boolean[][] visit;
    static int N, M;
    static boolean[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N][M];

        graph = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                graph[i][j] = chars[j] == '1';
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visit[i][j] && !graph[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    static void dfs(int n, int m) {
        if (visit[n][m]) return;
        visit[n][m] = true;
        if (n > 0 && !graph[n - 1][m]) dfs(n - 1, m);
        if (n < N - 1 && !graph[n + 1][m]) dfs(n + 1, m);
        if (m > 0 && !graph[n][m - 1]) dfs(n, m - 1);
        if (m < M - 1 && !graph[n][m + 1]) dfs(n, m + 1);
    }
}
