package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1343 {
    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        line = line.replaceAll("X{4}", "AAAA");
        line = line.replaceAll("X{2}", "BB");

        if (line.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(line);
        }
    }
}
