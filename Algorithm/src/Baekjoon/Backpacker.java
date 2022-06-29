package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backpacker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken()); //물건 개수
        int k = Integer.parseInt(st.nextToken()); //수용가능 무게
        int w = 0;
        int v = 0;

        System.out.println("개수 = " + n);
        System.out.println("무게 = " + k);

        for(int i = 0; i < n ; i++){
            st = new StringTokenizer(br.readLine()," "); // st초기화
            w = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            System.out.println("w = " + w);
            System.out.println("v = " + v);
        }

    }
}
