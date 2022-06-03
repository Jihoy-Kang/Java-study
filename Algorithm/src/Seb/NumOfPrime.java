package Seb;

import java.util.ArrayList;
import java.util.Arrays;

public class NumOfPrime {
    public static void main(String[] args) {
        int[] cards = new int[]{1,2,3,4};
        int sum = 0;
        int cnt = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < cards.length; i++) {
            for(int j = i + 1; j < cards.length; j++) {
                for(int k = j + 1; k < cards.length; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    arr.add(sum);
                    System.out.println(sum);
                }
            }
        }

        for(int i=0;i<arr.size();i++){
            boolean isPrime = false;
            int num = arr.get(i);

            for(int j = 2; j < num;j++){
                if(num%j == 0){
                    isPrime = true;
                }
            }

            if(isPrime != true){
                cnt++;
                System.out.println("소수 : " + num);
            }



        }
        System.out.println("cnt : " + cnt);
    }
}
