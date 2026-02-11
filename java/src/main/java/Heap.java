public class Heap {
    int[] heap;
    int size = 0;

    public Heap(int capacity) {
        heap = new int[capacity + 1];
    }

    public void insert(int val) {
        if (heap.length <= size) return;

        heap[++size] = val; // size+1(마지막)에 할당

        int idx = size;
        while (idx / 2 != 0) { // 최상위노드가 아닌 동안
            int pIdx = idx / 2;
            if (heap[idx] < heap[pIdx]) { // 부모보다 자식이 작으면 스왑 (최소힙)
                swap(idx, pIdx);
            }
            idx = pIdx;
        }
    }

    public int remove() {
        if (size == 0) return -1;

        int idx = 1;
        int rv = heap[idx]; // 리턴할 최상위노드 값 저장

        heap[idx] = heap[size]; // 마지막노드를 최상위노드로
        heap[size--] = 0; // 마지막 노드 제거처리

        while (idx * 2 <= size) { // 왼쪽자식노드가 있는 동안
            int lcIdx = idx * 2;
            int rcIdx = idx * 2 + 1;
            int targetIdx = rcIdx <= size && heap[rcIdx] < heap[lcIdx] ? rcIdx : lcIdx; // 오른쪽자식이 있고 걔가 왼쪽자식보다 작으면 오른쪽 인덱스, 아니면 왼쪽 인덱스
            if (heap[idx] <= heap[targetIdx]) {
                break; // 타겟 인덱스 노드보다 작으면 힙 조건 만족한 것
            }
            swap(idx, targetIdx); // 그렇지 않으면 스왑
            idx = targetIdx;
        }
        return rv;
    }

    public void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 1; i < heap.length; i++) {
            if (i != 1) sb.append(", ");
            sb.append(heap[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        var heap = new Heap(5);

        heap.insert(3);
        heap.insert(8);
        heap.insert(2);
        heap.insert(4);
        heap.insert(5);
        System.out.println(heap.toString());

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
    }
}

