package baekjoon.silver4;
/*
자료구조: Map
시간복잡도: O(N+M)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B1620_PokemonMaster {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] pokemons = new String[N];
        var map = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
            String pokemon = br.readLine();
            map.put(pokemon, i + 1);
            pokemons[i] = pokemon;
        }

        var sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            try {
                int num = Integer.parseInt(line);
                sb.append(pokemons[num - 1]).append("\n");
            } catch (NumberFormatException e) {
                sb.append(map.get(line)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
