package sort;

public class MergeSort {
    static void execute(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int t = 0;
        int l = left;
        int r = mid + 1;

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                temp[t++] = arr[l++]; // `<=`여야 STABLE하다!
            } else {
                temp[t++] = arr[r++];
            }
        }

        while (l <= mid) temp[t++] = arr[l++];
        while (r <= right) temp[t++] = arr[r++];

        for (int i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }
}
