package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B3009_FourthDot {
    public static void main(String[] args) throws IOException {

        //안다. 코드 나도 마음에 안든다.

        var br = new BufferedReader(new InputStreamReader(System.in));
        var map1 = new HashMap<Integer, Boolean>();
        var map2 = new HashMap<Integer, Boolean>();

        for (int i = 0; i < 3; i++) {
            var st = new StringTokenizer(br.readLine());
            int key1 = Integer.parseInt(st.nextToken());
            int key2 = Integer.parseInt(st.nextToken());
            map1.put(key1, map1.get(key1) == null || map1.get(key1) == false);
            map2.put(key2, map2.get(key2) == null || map2.get(key2) == false);
        }

        for (var e : map1.entrySet()) {
            if (e.getValue()) System.out.print(e.getKey() + " ");
        }
        for (var e : map2.entrySet()) {
            if (e.getValue()) System.out.print(e.getKey() + " ");
        }
    }
}
