package permAndCombo;

import java.util.ArrayList;
import java.util.List;

public class PermutateBacktracking {
    public static List<List<Integer>> permutate(int[] nums, int M) {
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
