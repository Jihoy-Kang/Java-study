package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//완전 탐색 문제
public class MovieDirector {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine()); //Int
        int num = 1665;
        int cnt =1;
        if(n==1){
            System.out.println(666);
        }else{
            while(n > cnt){
                num++;
                String strNum = Integer.toString(num);
                if(strNum.contains("666")){
                    cnt++;
                }
            }
            System.out.println(num);
        }
    }
}
