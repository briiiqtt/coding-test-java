package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10162_Microwave {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] buttons = new int[]{300, 60, 10};
        int[] counts = new int[3];

        if (T % buttons[2] != 0) {
            System.out.println(-1);
            return;
        }

        while (T > 0) {
            for (int i = 0; i < buttons.length; i++) {
                if (buttons[i] <= T) {
                    counts[i]++;
                    T -= buttons[i];
                    break;
                }
            }
        }

        System.out.println(counts[0] + " " + counts[1] + " " + counts[2]);
    }
}
