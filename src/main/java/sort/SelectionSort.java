package sort;

public class SelectionSort {
    public void execute(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minValIdx] > arr[j]) minValIdx = j;
            }
            int temp = arr[minValIdx];
            arr[minValIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
