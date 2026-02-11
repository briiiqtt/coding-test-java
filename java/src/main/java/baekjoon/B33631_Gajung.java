package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B33631_Gajung {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int Q = Integer.parseInt(br.readLine());
        int[] ingredients = new int[4];
        int[] recipe = new int[4];
        int made = 0;
        for (int i = 0; i < 4; i++) {
            ingredients[i] = Integer.parseInt(st.nextToken());
            recipe[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < Q; i++) {
            if (0 < sb.length()) sb.append("\n");

            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int q1 = Integer.parseInt(st3.nextToken());
            int q2 = Integer.parseInt(st3.nextToken());
            if (q1 == 1) {
                boolean isAvailable = true;
                for (int j = 0; j < ingredients.length; j++) {
                    if (ingredients[j] < q2 * recipe[j]) {
                        isAvailable = false;
                        sb.append("Hello, siumii");
                        break;
                    }
                }
                if (!isAvailable) continue;
                for (int j = 0; j < ingredients.length; j++) {
                    ingredients[j] -= q2 * recipe[j];
                }
                sb.append(made += q2);
            } else {
                sb.append(ingredients[q1 - 2] += q2);
            }
        }
        System.out.println(sb);
    }
}
