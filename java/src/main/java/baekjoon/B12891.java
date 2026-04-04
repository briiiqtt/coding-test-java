package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12891 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] line = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        int[] need = new int[4];
        for (int i = 0; i < need.length; i++) {
            need[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int[] cnts = new int[4];
        for (int i = 0; i < P; i++) {
            char c = line[i];
            if (c == 'A') cnts[0]++;
            else if (c == 'C') cnts[1]++;
            else if (c == 'G') cnts[2]++;
            else if (c == 'T') cnts[3]++;
        }

        if (cnts[0] >= need[0] && cnts[1] >= need[1] && cnts[2] >= need[2] && cnts[3] >= need[3]) {
            count++;
        }

        for (int i = 1; i < S - P + 1; i++) {
            char first = line[i - 1];
            if (first == 'A') cnts[0]--;
            else if (first == 'C') cnts[1]--;
            else if (first == 'G') cnts[2]--;
            else if (first == 'T') cnts[3]--;

            char end = line[i + P - 1];
            if (end == 'A') cnts[0]++;
            else if (end == 'C') cnts[1]++;
            else if (end == 'G') cnts[2]++;
            else if (end == 'T') cnts[3]++;

            if (cnts[0] >= need[0] && cnts[1] >= need[1] && cnts[2] >= need[2] && cnts[3] >= need[3]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
