package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1541_LostParenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] l = line.split("-");

        int result = 0;
        for (String s : l[0].split("\\+")) {
            int n = Integer.parseInt(s);
            result += n;
        }

        for (int i = 1; i < l.length; i++) {
            for (String s : l[i].split("\\+")) {
                int n = Integer.parseInt(s);
                result -= n;
            }
        }

        System.out.println(result);
    }
}
