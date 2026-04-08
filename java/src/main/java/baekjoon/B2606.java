package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2606 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> graph;
    static int infected = 0;

    public static void main(String[] args) throws IOException {
        int computerCount = Integer.parseInt(br.readLine());
        int connectionCount = Integer.parseInt(br.readLine());

        visit = new boolean[computerCount + 1];
        graph = new ArrayList<>();
        for (int i = 0; i < computerCount + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < connectionCount; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        dfs(1);
        System.out.println(--infected);
    }

    static void dfs(int n) {
        if (visit[n]) return;
        infected++;
        visit[n] = true;
        ArrayList<Integer> list = graph.get(n);
        for (int i = 0; i < list.size(); i++) {
            dfs(list.get(i));
        }
    }
}
