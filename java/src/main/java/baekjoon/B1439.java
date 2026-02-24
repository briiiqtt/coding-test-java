package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1439 {
    public static void main(String[] args) throws IOException {
        /*
        문자열 전체 순회하면서 연속된 0과 연속된 1 개수 카운트
        둘 중 적은 개수가 답
         */
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int zeroStringCount = 0;
        int oneStringCount = 0;

        for (int i = 0; i < line.length() - 1; i++) {
            if (line.charAt(i) != line.charAt(i + 1)) {
                if (line.charAt(i) == '0') zeroStringCount++;
                else oneStringCount++;
            }
        }

        System.out.println(Math.max(zeroStringCount, oneStringCount));
    }
}
