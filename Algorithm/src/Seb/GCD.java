package Seb;

import java.util.ArrayList;

public class GCD {
    public static void main(String[] args) {
        int M = 8;
        int N = 10;
        int max = Math.max(M,N);

        ArrayList<Integer[]> result = new ArrayList<Integer[]>();
        Integer[] div = new Integer[3];
        for(int i =1; i<=max;i++ ){
            if(M%i ==0 && N%i ==0){
                result.add(new Integer[]{i, M/i, N/i}); //새로운 배열에 값을 넣어줘야 다른 참조변수에 값이 들어가지 안그럼 같은 참조변수에 값만 바뀌게된다.
            }
        }
        System.out.println(result);

    }
}
