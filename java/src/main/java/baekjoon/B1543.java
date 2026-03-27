package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String search = br.readLine();

        int cnt = 0;
        for (int i = 0; i < line.length() - search.length() + 1; i++) {
            boolean same = search.charAt(0) == line.charAt(i);
            if (same) {
                if (line.substring(i, i + search.length()).equals(search)) {
                    cnt++;
                    i += search.length() - 1;
                }
            }
        }
        System.out.println(cnt);
    }
}
