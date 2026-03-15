package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            char c = br.readLine().charAt(0);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> a : map.entrySet()) {
            if (a.getValue() >= 5) sb.append(a.getKey());
        }
        System.out.println(sb.length() > 0 ? sb : "PREDAJA");
    }
}
