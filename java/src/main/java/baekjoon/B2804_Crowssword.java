package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2804_Crowssword {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        int I = 0, J = 0;
        boolean found = false;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    I = i;
                    J = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < B.length(); i++) {
            for (int j = 0; j < A.length(); j++) {
                char c = j == I ? B.charAt(i) : i == J ? A.charAt(j) : '.';
                sb.append(c);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
