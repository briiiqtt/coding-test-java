package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder sb = new StringBuilder();
        while (!(line = br.readLine()).equals("END")) {
            sb.append(new StringBuilder(line).reverse()).append("\n");
        }

        System.out.println(sb);
    }
}
