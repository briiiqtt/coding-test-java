package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1181_SortingWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int lineCount = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < lineCount; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> list = new ArrayList<>(set);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length())
                    return -1;
                else if (o1.length() > o2.length())
                    return 1;
                else {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) < o2.charAt(i))
                            return -1;
                        else if (o1.charAt(i) > o2.charAt(i))
                            return 1;
                    }
                    return 0;
                }
            }
        });

        for (String str : list) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}
