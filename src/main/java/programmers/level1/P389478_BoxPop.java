package programmers.level1;

import java.util.ArrayList;
import java.util.Stack;

public class P389478_BoxPop {

    public int solution(int n, int w, int num) {
        int answer = 0;

        ArrayList<Stack<Integer>> list = new ArrayList<>();

        for (int i = 0; i < w; i++) {
            list.add(new Stack<Integer>());
        }

        for (int i = 1; i <= n; i++) {
            int x = getX(w, i);
            list.get(x).add(i);
        }

        int x = getX(w, num);

        System.out.println(x);
        System.out.println(list);

        int pop = 0;
        while (pop != num) {
            pop = list.get(x).pop();
            answer++;
        }

        return answer;
    }

    public int getX(int w, int num) {
        int x = 0;
        num -= 1;
        boolean isReverse = ((int) (num / w)) % 2 == 1;

        if (isReverse)
            x = w - 1 - (num % w);
        else
            x = num % w;

        return x;
    }

}