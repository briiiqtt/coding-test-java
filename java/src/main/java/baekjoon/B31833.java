package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B31833 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        StringBuilder sb1 = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sb1.append(st1.nextToken());
        }
        StringBuilder sb2 = new StringBuilder();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sb2.append(st2.nextToken());
        }

        if (sb1.length() != sb2.length()) {
            System.out.println(sb1.length() < sb2.length() ? sb1 : sb2);
            return;
        } else {
            String str1 = sb1.toString();
            String str2 = sb2.toString();
            for (int i = 0; i < N; i++) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    System.out.println(str1);
                    return;
                } else if (str1.charAt(i) > str2.charAt(i)) {
                    System.out.println(str2);
                    return;
                }
            }
            System.out.println(str1);
        }
    }
}
