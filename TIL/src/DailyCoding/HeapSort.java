package DailyCoding;

import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,2,6,7};

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i : arr){
            heap.add(i);
        }

        System.out.println(heap);
    }
}
