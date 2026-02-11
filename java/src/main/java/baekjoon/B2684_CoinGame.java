package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2684_CoinGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            char[] charArray = br.readLine().toCharArray();

            // TTT TTH THT THH HTT HTH HHT HHH
            int[] counts = new int[8];
            for (int j = 0; j < 40 - 2; j++) {
                if (charArray[j] == 'H') {
                    if (charArray[j + 1] == 'H') {
                        if (charArray[j + 2] == 'H') {
                            counts[7]++;
                        } else {
                            counts[6]++;
                        }
                    } else {
                        if (charArray[j + 2] == 'H') {
                            counts[5]++;
                        } else {
                            counts[4]++;
                        }
                    }
                } else { // T
                    if (charArray[j + 1] == 'H') {
                        if (charArray[j + 2] == 'H') {
                            counts[3]++;
                        } else {
                            counts[2]++;
                        }
                    } else {
                        if (charArray[j + 2] == 'H') {
                            counts[1]++;
                        } else {
                            counts[0]++;
                        }
                    }
                }
            }
            for (int j = 0; j < counts.length; j++) {
                if (0 < j) sb.append(" ");
                sb.append(counts[j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
