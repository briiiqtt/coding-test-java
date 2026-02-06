package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2857_FBI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            if (br.readLine().contains("FBI")) sb.append(i).append("\n");
        }
        System.out.println(sb.length() == 0 ? "HE GOT AWAY!" : sb);
    }
}
