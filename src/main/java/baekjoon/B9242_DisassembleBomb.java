package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B9242_DisassembleBomb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
         ***   * * * *** *** *** ***
         * *   * * *   *   *   * *
         * *   * *** *** *** *** ***
         * *   *   * *     * *   * *
         ***   *   * *** *** *** ***
         */

        String[] lines = new String[5];

        for (int i = 0; i < 5; i++) {
            lines[i] = br.readLine();
        }

        int codeLength = (lines[0].length() + 1) / 4;

        StringBuilder codeSB = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < lines.length; j++) {
                sb.append(lines[j].charAt(i * 4));
                sb.append(lines[j].charAt(i * 4 + 1));
                sb.append(lines[j].charAt(i * 4 + 2));
            }

            int c = parseCode(sb.toString());
            if (c == -1) {
                System.out.println("BOOM!!");
                return;
            }

            codeSB.append(c);
        }

        int code = Integer.parseInt(codeSB.toString());
        System.out.println(code % 6 == 0 ? "BEER!!" : "BOOM!!");
    }

    public static int parseCode(String code) {
        switch (code) {
            case "**** ** ** ****":
                return 0;
            case "  *  *  *  *  *":
                return 1;
            case "***  *****  ***":
                return 2;
            case "***  ****  ****":
                return 3;
            case "* ** ****  *  *":
                return 4;
            case "****  ***  ****":
                return 5;
            case "****  **** ****":
                return 6;
            case "***  *  *  *  *":
                return 7;
            case "**** ***** ****":
                return 8;
            case "**** ****  ****":
                return 9;
            default:
                return -1;
        }
    }
}
