package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class largestProductOfThree {
    public static void main(String[] args) {

        //정수를 요소로 갖는 배열에서 3개를 뽑아 만들 수 있는 가장 큰 수를 리턴
        //음수와 0이 요소로 들어갈 수 있음


        //1. 음수 2개로 뽑아만든 최대값이 양수 2번째 3번째 곱한값보다 크다면,
        //2. 음수로 2개를 뽑아 만들 수 있는 최대 값과 양수 중 가장 큰값을 곱한다.
        //
        int[] arr = new int[]{-5, -4, -3, -2, -1};

        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();
        for(int a : arr){
            if(a <0 ){
                negative.add(a);
            }else{
                positive.add(a);
            }
        }
        Arrays.sort(arr);
        Collections.sort(negative);
        Collections.sort(positive);
        int negMax = 0;
        int posSecondMax = arr[arr.length-2] * arr[arr.length-3];
        if(negative.size() >= 2 && positive.size() > 1){
            negMax = negative.get(0) * negative.get(1);
            if(negMax > posSecondMax){
                System.out.println(negMax * arr[arr.length-1]);
            }else{
                System.out.println(posSecondMax * arr[arr.length-1]);
            }
        }else{
            System.out.println(arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3] );
        }


        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);


    }


}
