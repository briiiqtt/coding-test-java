package baekjoon.silver3;
/*
자료구조: 정수32
시간복잡도: O(N!) (O(NPM), O(N!/(N-M)!)
공간복잡도: O(N^2)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B15649_NAndM1 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = i + 1;
        }

        List<List<Integer>> result = permutate(nums, M);

        StringBuilder sb = new StringBuilder();
        for (List<Integer> perm : result) {
            for (Integer num : perm) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static List<List<Integer>> permutate(int[] nums, int M) {
        List<List<Integer>> perms = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtracking(nums, M, visited, new ArrayList<>(), perms);
        return perms;
    }

    static void backtracking(int[] nums, int M, boolean[] visited, List<Integer> perm, List<List<Integer>> perms) {
        if (perm.size() == M) {
            perms.add(new ArrayList<>(perm)); // 깊은복사해야함!
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            perm.add(nums[i]);

            backtracking(nums, M, visited, perm, perms);

            perm.remove(perm.size() - 1);
            visited[i] = false;
        }
    }
}
