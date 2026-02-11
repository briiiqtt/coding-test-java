package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5073_TriangleAndSides {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = br.readLine()).equals("0 0 0")) {
            int[] sides = new int[3];
            var st = new StringTokenizer(line);

            for (int i = 0; i < 3; i++) {
                sides[i] = Integer.parseInt(st.nextToken());
            }

            if (sides[0] >= sides[1] + sides[2] || sides[1] >= sides[2] + sides[0] || sides[2] >= sides[0] + sides[1]) {
                System.out.println("Invalid");
            } else if (sides[0] == sides[1] && sides[1] == sides[2]) {
                System.out.println("Equilateral");
            } else if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
