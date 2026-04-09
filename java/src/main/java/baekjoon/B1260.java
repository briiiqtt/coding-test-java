package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1260 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static ArrayDeque<Integer> stack = new ArrayDeque<>();
    static ArrayDeque<Integer> queue = new ArrayDeque<>();
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        visit = new boolean[N + 1];

        for (int i = 0; i < N + 1; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i < graph.size(); i++) {
            graph.get(i).sort(Comparator.naturalOrder());
        }

        stack.push(V);
        visit[V] = true;
        sb.append(V).append(" ");
        while (!stack.isEmpty()) {
            /*
            스택의 최상단의 노드와 연결돼있는 노드들 중 가장 번호가 작은 노드를 찾는다
            연결된 노드가 없거나 이미 모두 방문한 경우 스택에서 현재 노드를 제거한다
            그렇지 않으면 번호가 가장 작은 노드를 스택에 푸시한다
             */
            int v = stack.peek();
            boolean visited = false;
            for (int i = 0; i < graph.get(v).size(); i++) {
                int u = graph.get(v).get(i);
                if (!visit[u]) {
                    visit[u] = true;
                    sb.append(u).append(" ");
                    stack.push(u);
                    visited = true;
                    break;
                }
            }
            if (!visited) stack.pop();
        }
        sb.append("\n");

        visit = new boolean[N + 1];
        queue.offer(V);
        visit[V] = true;
        sb.append(V).append(" ");
        while (!queue.isEmpty()) {
            /*
            큐의 맨앞 노드와 연결돼있는 노드를 번호가 낮은 순으로 모두 큐에 넣는다
            큐에서 맨앞 노드를 제거한다
             */
            int v = queue.poll();
            for (int i = 0; i < graph.get(v).size(); i++) {
                int u = graph.get(v).get(i);
                if (visit[u]) continue;
                visit[u] = true;
                sb.append(u).append(" ");
                queue.offer(u);
            }
        }

        System.out.println(sb);
    }
}
