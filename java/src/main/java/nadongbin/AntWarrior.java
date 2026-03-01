package nadongbin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AntWarrior {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] depots = new int[N];
        for (int i = 0; i < N; i++) {
            depots[i] = Integer.parseInt(st.nextToken());
        }

        int prev2 = depots[0];
        int prev1 = Math.max(depots[0], depots[1]);

        for (int i = 2; i < N; i++) {
            int a = Math.max(prev1, prev2 + depots[i]);
            prev2 = prev1;
            prev1 = a;
        }

        System.out.println(prev1);
    }
}
