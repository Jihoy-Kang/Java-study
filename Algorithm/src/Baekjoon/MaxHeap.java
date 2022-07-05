package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int  n = Integer.parseInt(br.readLine());
        for(int i=0; i < n ;i++){
            int  x = Integer.parseInt(br.readLine());
            if(que.isEmpty() && x == 0){
                sb.append(0).append('\n');
            }else if(x==0){
                sb.append(que.poll()).append('\n');
            }else{
                que.add(x);
            }
        }
        System.out.println(sb.toString());
    }
}
