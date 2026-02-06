package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9493_TrainOrAirplane {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            if (line.equals("0 0 0")) break;
            if (sb.length() > 0) sb.append("\n");
            StringTokenizer st = new StringTokenizer(line);

            double M = Integer.parseInt(st.nextToken());
            double A = Integer.parseInt(st.nextToken());
            double B = Integer.parseInt(st.nextToken());

            double a = (M / A) * 3600;
            double b = (M / B) * 3600;

            double diffDouble = a > b ? a - b : b - a;
            int diff = (int) Math.round(diffDouble);

            int sec = diff % 60;
            diff /= 60;
            int min = diff % 60;
            diff /= 60;
            int hour = diff;

            sb.append(hour).append(":").append(min < 10 ? "0" + min : min).append(":").append(sec < 10 ? "0" + sec : sec);
        }

        System.out.println(sb);
    }
}
