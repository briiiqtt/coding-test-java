package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25703_StudyPointer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("int a;\nint *ptr = &a;\n");
        for (int i = 2; i <= N; i++) {
            sb.append("int ");
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("ptr").append(i).append(" = &ptr").append(i - 1 < 2 ? "" : i - 1).append(";\n");
        }
        System.out.println(sb);
    }
}
