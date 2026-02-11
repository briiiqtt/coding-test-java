package baekjoon;
/*
자료구조: 배열
시간복잡도: O(N log N)
공간복잡도: O(N)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24060_MergeSort1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int[] recurCnt = new int[1];
        mergeSort(arr, 0, N - 1, recurCnt, K);
        if (recurCnt[0] < K) System.out.println(-1);
    }

    static void mergeSort(int[] arr, int left, int right, int[] recurCnt, int K) {
        if (recurCnt[0] == K) return;

        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, recurCnt, K);
            mergeSort(arr, mid + 1, right, recurCnt, K);
            merge(arr, left, mid, right, recurCnt, K);
        }
    }

    static void merge(int[] arr, int left, int mid, int right, int[] recurCnt, int K) {
        if (recurCnt[0] == K) return;

        int[] temp = new int[right - left + 1];
        int t = 0;
        int l = left;
        int r = mid + 1;
        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                temp[t++] = arr[l++];
            } else {
                temp[t++] = arr[r++];
            }
        }
        while (l <= mid) {
            temp[t++] = arr[l++];
        }
        while (r <= right) {
            temp[t++] = arr[r++];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
            if (++recurCnt[0] == K) System.out.println(temp[i]);
        }
    }
}
