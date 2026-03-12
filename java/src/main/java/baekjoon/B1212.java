package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1212 {
    public static void main(String[] args) throws IOException {
        char[] chars = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        String[] nums = new String[]{"000", "001", "010", "011", "100", "101", "110", "111"};
        sb.append(Integer.parseInt(nums[chars[0] - '0']));
        for (int i = 1; i < chars.length; i++) {
            sb.append(nums[chars[i] - '0']);
        }
        System.out.println(sb);
    }
}
