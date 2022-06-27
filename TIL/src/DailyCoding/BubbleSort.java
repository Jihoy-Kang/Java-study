package DailyCoding;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 3, 5, 7, 4, 6};
        int storage = 0;
        int n = arr.length;
        for(int j = 0; j <n ; j++){
            int swap = 0;
            for(int i = 0; i < n - 1;i++){
                if(arr[i]>arr[i+1]){
                    storage = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = storage;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }
}

/*

    //두 변수를 바꾸는 방법
    int temp = arr[idx1];
    arr[idx1] = arr[idx2];
            arr[idx2] = temp;

            //XOR 연산을 활용한 방법
            //arr이 reference type이라 가능
//     arr[idx1] ^= arr[idx2];
//     arr[idx2] ^= arr[idx1];
//     arr[idx1] ^= arr[idx2];

            return arr;
            }

//  // naive solution
//  public int[] bubbleSort(int[] arr) {
//    int arrLength = arr.length;

//    for(int i = 0; i < arrLength - 1; i++) {
//       //매 반복(iteration)마다 i번째로 큰 수가 마지막에서 i번째 위치하게 된다.
//       //이미 정렬된 요소는 고려할 필요가 없으므로, 'j < N - 1 - i'만 비교하면 된다.
//      for(int j = 0; j < arrLength - 1; j++) {
//        if(arr[j] > arr[j + 1]) {
//          arr = swap(j, j+1, arr);
//        }
//      }
//    }
//    return arr;
//  }

// optimized solution
public int[] bubbleSort(int[] arr) {
        int arrLength = arr.length;

        for(int i = 0; i < arrLength; i++) {
        // swap 횟수를 기록한다.
        // 어떤 요소도 swap되지 않은 경우, 배열은 정렬된 상태이다.
        int swaps = 0;

        // 매 반복(iteration)마다 i번째로 큰 수가 마지막에서 i번째 위치하게 된다.
        // 이미 정렬된 요소는 고려할 필요가 없으므로, 'j < N - 1 - i'만 비교하면 된다.
        for(int j = 0; j < arrLength - 1; j++) {
        if(arr[j] > arr[j+1]) {
        swaps++;
        arr = swap(j, j+1, arr);
        }
        }
        if(swaps == 0) {
        break;
        }
        }
        return arr;*/
