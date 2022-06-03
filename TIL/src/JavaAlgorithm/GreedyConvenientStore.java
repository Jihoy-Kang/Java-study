package JavaAlgorithm;

import java.util.Arrays;

public class GreedyConvenientStore {
    public static void main(String[] args) {
        int k = 4972; // 거스름 돈
        int num = 0;
        int[] coins = new int[]{500,100,50,10,5,1};

        for(int coin : coins){
            num += k/coin;
            k=k%coin;
        }
        System.out.println(num);
    }
}
// 1, 5 ,10 , 50, 100, 500동전을 활용하여 필요한 동전 개수의 최소값을구하는 함수
/*
* 하드코딩하면 내림차순으로 나눠주면서 0을 만들면 되는데
* 거스름돈 리스트에 넣고 while문 돌리면될듯...
*
*
* */