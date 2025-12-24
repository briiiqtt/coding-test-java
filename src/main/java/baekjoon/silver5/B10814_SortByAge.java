package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B10814_SortByAge {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        var list = new ArrayList<Member>();
        for (int i = 0; i < N; i++) {
            var st = new StringTokenizer(br.readLine());
            list.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        Collections.sort(list, (a, b) -> {
            return Integer.compare(a.age, b.age);
        });

        for (int i = 0; i < list.size(); i++) {
            var member = list.get(i);
            System.out.println(member.age + " " + member.name);
        }
    }

    public static class Member {
        public int age;
        public String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
