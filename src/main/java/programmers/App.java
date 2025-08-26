package programmers;

import programmers.level2.TheMostBigNumber_42746;

public class App {
    public static void main(String[] args) {
        System.out.println();

        var sol = new TheMostBigNumber_42746();

        Object ans = sol.solution(new int[] { 3, 30, 34, 5, 9 });

        System.out.println("ANSWER: " + ans);
    }
}