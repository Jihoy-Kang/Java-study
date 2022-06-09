package DailyCoding;

import java.util.Arrays;

public class removeExtremes {
    public static void main(String[] args) {
        String[] arr = new String[]{};
        int max = 0;
        int min = 20;
        int maxIndex = 0;
        int minIndex = 0;
        int index = 0;
        String[] result = new String[arr.length-2];
        if(arr.length == 0) System.out.println("null");
        for(int i = 0; i<arr.length ; i++){
            if(arr[i].length() >= max){
                max = arr[i].length();
                maxIndex = i;
            }
            if(arr[i].length() <= min){
                min = arr[i].length();
                minIndex = i;
            }
        }
        for(int j = 0; j<arr.length ;j++){

            if(j == maxIndex || j == minIndex){
                continue;
            }else{
                result[index] = arr[j];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
