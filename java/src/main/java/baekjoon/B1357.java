package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1357 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println(rev(rev(st.nextToken()) + rev((st.nextToken()))));
    }

    static int rev(String num) {
        return Integer.parseInt(new StringBuilder(num).reverse().toString());
    }

    static int rev(int num) {
        return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
    }
}
