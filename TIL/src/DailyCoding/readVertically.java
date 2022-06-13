package DailyCoding;

import java.util.Arrays;

public class readVertically {
    public static void main(String[] args) {
        String[] arr = new String[]{"hi","world"};
        String result = "";
        int max = 0;
        System.out.println(Arrays.toString(arr));
        for(String s : arr){
            if(max<=s.length()){
                max = s.length();
            }
        }

        for(int i =0; i<max;i++){
            for(int j =0; j<arr.length;j++){
                if(arr[j].length() <=i){
                    continue;
                }else{
                    result += arr[j].charAt(i);
                }

            }
        }
        System.out.println(result);
    }
}
