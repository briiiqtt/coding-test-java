package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B31628_Gaji {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] arr = new String[10][10];
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                arr[i][j] = st.nextToken();
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (!arr[i][j].equals(arr[i][j + 1])) break;
                if (j == 8) {
                    System.out.println(1);
                    return;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (!arr[j][i].equals(arr[j + 1][i])) break;
                if (j == 8) {
                    System.out.println(1);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
