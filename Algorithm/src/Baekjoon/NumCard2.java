package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumCard2 {
    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> cardArr = new ArrayList<>();
        ArrayList<String> numArr = new ArrayList<>();


        int cnt = 0;


        // 상근이가 가지고 있는카드 입력
        int n = sc.nextInt(); //Int // 첫번째 n값 입력
        StringTokenizer cardNum = new StringTokenizer(br.readLine());
        for(int i = 0; i<n ; i++){
            cardArr.add(cardNum.nextToken());
        }

        // 주어지는 정수 입력
        int m = sc.nextInt(); //Int // 두번째 m값 입력
        StringTokenizer num = new StringTokenizer(br.readLine());
        for(int i = 0; i<m ; i++){
            numArr.add(num.nextToken());
        }

        // 상근이가 가지고있는 카드 수
        int[] resultArr = new int[m]; //카운트 넣을 어레이
        for(int j=0;j<m;j++){

            cnt = Collections.frequency(cardArr,numArr.get(j));
            resultArr[j] = cnt;
        }

        String result = "";
        for(int i=0;i< resultArr.length;i++){
            if(i == resultArr.length-1){
                result += resultArr[i];
            }else{
                result += resultArr[i] + " ";
            }
        }

        System.out.println(cardArr);
        System.out.println(numArr);
        System.out.println(result);*/
    }
}
