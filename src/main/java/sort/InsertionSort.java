package sort;

public class InsertionSort {
    /*
    public void execute(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else break;
            }
        }
    }

    이렇게 매번 스왑을 하면, 메모리 접근 횟수 오버헤드가 있음.
    자리를 찾을 때 까지 한 칸씩 밀고 마지막에 '삽입'을 하는 게 더 효율적임.
    */
    static void execute(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = val;
        }
    }
}
