package programmers.level2;

public class TheMostBigNumber_42746 {
    public String solution(int[] numbers) {
        String answer = "";

        for (int i = 0; i + 1 < numbers.length; i++) {
            int n = numbers[i];
            int m = numbers[i + 1];

            while (n >= 10) {
                n /= 10;
            }
            while (m >= 10) {
                m /= 10;
            }

            if (n < m) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        return answer;
    }
}
