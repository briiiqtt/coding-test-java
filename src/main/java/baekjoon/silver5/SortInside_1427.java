package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortInside_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] nums = br.readLine().split("");
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }
}
