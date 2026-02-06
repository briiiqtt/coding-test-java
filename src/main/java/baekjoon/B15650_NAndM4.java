package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B15650_NAndM4 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        permutation(N, M);
    }

    static void permutation(int N, int M) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        StringBuilder sb = new StringBuilder();
        backtracking(arr, M, new ArrayList<Integer>(), sb);

        System.out.println(sb);
    }

    static void backtracking(int[] arr, int M, List<Integer> perm, StringBuilder sb) {
        if (perm.size() == M) {
            for (int i = 0; i < perm.size(); i++) {
                sb.append(perm.get(i)).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!perm.isEmpty() && arr[i] < perm.get(perm.size() - 1)) continue;

            perm.add(arr[i]);

            backtracking(arr, M, perm, sb);

            perm.remove(perm.size() - 1);
        }
    }
}
