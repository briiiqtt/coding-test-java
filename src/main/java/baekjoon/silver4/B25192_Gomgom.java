package baekjoon.silver4;
/*
ENTER 이후 챗을 Set에
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B25192_Gomgom {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if (line.equals("ENTER")) {
                cnt += set.size();
                set.clear();
            } else {
                set.add(line);
            }
        }
        cnt += set.size();
        System.out.println(cnt);
    }
}
