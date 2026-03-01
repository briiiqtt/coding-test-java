package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B31496 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer fl = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(fl.nextToken());
        String S = fl.nextToken();

        int count = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String item = st.nextToken();
            StringTokenizer sp = new StringTokenizer(item, "_");
            while (sp.hasMoreTokens()) {
                if (sp.nextToken().equals(S)) {
                    count += Integer.parseInt(st.nextToken());
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
