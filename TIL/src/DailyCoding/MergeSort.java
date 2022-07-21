package DailyCoding;

import java.util.Arrays;

public class MergeSort {
    public static int[] arr;
    public static int[] temp;
    public static int[] result;
    public static void main(String[] args) {

        arr = new int[]{7,4,2,12,3,5,1};
        temp = new int[arr.length];
        result = Arrays.copyOf(arr, arr.length);
        mergeSort(0, result.length-1);
        System.out.println(Arrays.toString(result));
    }

    public static void mergeSort(int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);

            int p = start;
            int q = mid+1;
            int idx = p;

            while (p<=mid || q<=end){
                if(q>end || (p<=mid && result[p]<result[q])){
                    temp[idx++] = result[p++];
                }else{
                    temp[idx++] = result[q++];
                }
            }

            for(int i=start;i<=end;i++){
                result[i]=temp[i];
            }
        }

    }
}

