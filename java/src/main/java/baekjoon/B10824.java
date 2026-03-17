package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10824 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        long AB = Long.parseLong(st.nextToken() + st.nextToken());
        long CD = Long.parseLong(st.nextToken() + st.nextToken());
        System.out.println(AB + CD);
    }
}
