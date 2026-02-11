package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B30033_RustStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(st1.nextToken()) <= Integer.parseInt(st2.nextToken())) cnt++;
        }
        System.out.println(cnt);
    }
}
