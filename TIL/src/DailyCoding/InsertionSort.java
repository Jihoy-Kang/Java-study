package DailyCoding;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 21,42,5,64,122};


        for(int i = 1;i<arr.length;i++){
            int temp = arr[i];
            int index = i;
            while(index > 0){
                if(arr[index] < arr[index-1]){
                    arr[index] = arr[index-1];
                    arr[index-1] = temp;
                }
                index--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
