package baekjoon;
/*
자료구조: Set
시간복잡도: O(N log N) (Timsort)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B7785_PeopleWhoAreAtOffice {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        var set = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            var st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            boolean entered = st.nextToken().equals("enter");
            if (entered) set.add(name);
            else set.remove(name);
        }

        String[] office = new String[set.size()];
        int seq = 0;
        for (String name : set) {
            office[seq++] = name;
        }

        Arrays.sort(office, Comparator.reverseOrder());

        var sb = new StringBuilder();
        for (String name : office) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}
