package baekjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B30501_GWANU {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String name = null;
        for (int i = 0; i < N; i++) {
            if ((name = br.readLine()).contains("S")) break;
        }
        System.out.println(name);
    }
}
