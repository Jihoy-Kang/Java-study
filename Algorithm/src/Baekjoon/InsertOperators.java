package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertOperators {
    public static int max = 0;
    public static int min = 0;
    public static int[] operators = new int[4];
    public static int[] number;
    public static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        number = new int[n];

        //숫자입력
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i <n;i++){
            number[i] = Integer.parseInt(st.nextToken());
        }

        //연산자 입력
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < 4; i++){
            operators[i] = Integer.parseInt(st.nextToken());
        }

        dfs(number[0],1);

        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int num, int idx){
        if(idx == n){
            max = Math.max(max,num);
            min = Math.min(min,num);
            return;
        }

        for(int i =0;i<4;i++){
            if(operators[i] > 0){
                operators[i]--;

                switch (i){

                    case 0 : dfs(num+number[idx], idx+1); break;
                    case 1 : dfs(num-number[idx], idx+1); break;
                    case 2 : dfs(num*number[idx], idx+1); break;
                    case 3 : dfs(num/number[idx], idx+1); break;
                }
                operators[i]++;
            }
        }
    }
}

