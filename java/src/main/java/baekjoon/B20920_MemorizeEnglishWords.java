package baekjoon;
/*
자료구조: 해시맵
시간복잡도: O(N log N)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B20920_MemorizeEnglishWords {
    public static void main(String[] args) throws IOException {
        // 1. map에 단어-횟수로 매핑
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() < M) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // 2. 정렬
        ArrayList<Word> list = new ArrayList<>();
        for (var word : map.entrySet()) {
            list.add(new Word(word.getKey(), word.getValue()));
        }

        Collections.sort(list, (a, b) -> {
            if (a.count == b.count) {
                if (a.spelling.length() == b.spelling.length()) {
                    return a.spelling.compareTo(b.spelling);
                }
                return Integer.compare(b.spelling.length(), a.spelling.length());
            }
            return Integer.compare(b.count, a.count);
        });

        // 3. 출력
        var sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).spelling).append("\n");
        }
        System.out.println(sb);
    }

    static class Word {
        String spelling;
        int count;

        Word(String spelling, int count) {
            this.spelling = spelling;
            this.count = count;
        }
    }
}
