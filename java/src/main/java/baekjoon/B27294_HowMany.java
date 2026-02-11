package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B27294_HowMany {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        boolean sake = st.nextToken().equals("1");
        if (sake || !(12 <= time && time <= 16)) System.out.println(280);
        else System.out.println(320);
    }
}
