package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class B1764_Deutbojob {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        HashSet<String> set1 = new HashSet<>();
        ArrayList<String> deutbos = new ArrayList<>();

        for (int i = 0; i < n + m; i++) {
            String name = br.readLine();
            if (!set1.add(name)) {
                deutbos.add(name);
            }
        }

        deutbos.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        sb.append(deutbos.size()).append("\n");

        for (String name : deutbos) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
