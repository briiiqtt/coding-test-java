package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        String best = null;
        int max = 0;
        for (int i = 0; i < N; i++) {
            String key = br.readLine();
            int count = map.getOrDefault(key, 0) + 1;
            map.put(key, count);
            if (count == max){
                best = best == null || best.compareTo(key) > 0 ? key : best;
            } else if (count > max) {
                max = count;
                best = key;
            }
        }
        System.out.println(best);
    }
}
