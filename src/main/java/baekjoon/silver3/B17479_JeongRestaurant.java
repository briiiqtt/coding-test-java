package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B17479_JeongRestaurant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Menu> menus = new HashMap<>();
        int kind = 0;
        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            for (int i = 0; i < a; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                String name = st2.nextToken();
                int price = 0;
                if (st2.hasMoreTokens()) price = Integer.parseInt(st2.nextToken());
                menus.put(name, new Menu(name, price, kind));
            }
            kind++;
        }

        int N = Integer.parseInt(br.readLine());
        long[] prices = new long[3];
        long[] counts = new long[3];
        for (int i = 0; i < N; i++) {
            Menu menu = menus.get(br.readLine());
            prices[menu.kind] += menu.price;
            counts[menu.kind]++;
        }

        boolean fail = counts[1] > 0 && prices[0] < 20000
                || counts[2] > 0 && prices[0] + prices[1] < 50000
                || counts[2] > 1;

        System.out.println(fail ? "No" : "Okay");
    }

    static class Menu {
        String name;
        int price;
        int kind;

        Menu(String name, int price, int kind) {
            this.name = name;
            this.price = price;
            this.kind = kind;
        }
    }
}
