package sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 999999999, Integer.MIN_VALUE, 0, 22, 333, 4444, 55555, -1, Integer.MAX_VALUE, 666666, 22, 7777777, 333, 88888888, 1};
        MergeSort.execute(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
