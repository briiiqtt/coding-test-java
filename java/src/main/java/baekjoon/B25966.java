package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read N M q
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        // read NiMj, i=line j=space
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // for q:
        for (int k = 0; k < q; k++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if (command.equals("0")) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            } else {
                int[] temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (sb.length() > 0) sb.append("\n");
            for (int j = 0; j < M; j++) {
                if (j > 0) sb.append(" ");
                sb.append(arr[i][j]);
            }
        }

        System.out.println(sb);
    }
}
