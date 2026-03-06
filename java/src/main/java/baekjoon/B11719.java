package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c;
        StringBuilder sb = new StringBuilder();
        while ((c = br.read()) != -1) {
            sb.append((char) c);
        }
        System.out.println(sb);
    }
}
