package Baekjoon;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.io.*;

public class StackSequence {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine()); //Int // 첫번째 n값 입력
        int[] arr = new int[n]; // 입력값 넣을 배열 생성

        for(int i = 0; i < n;i++){ // 배열에 입력값 넣기
            arr[i] = Integer.parseInt(bf.readLine());
        }

        //ArrayList<Integer> result = new ArrayList<>(); // 제대로 출력이 되는 확인하기 위한 어레이리스트(없어도 됨)
        ArrayList<String> print = new ArrayList<>(); // +,-, NO 넣을 어레이리스트
        Stack<Integer> stack = new Stack<>(); //
        //System.out.println(Arrays.toString(arr));

        int index = 0;
        int num = 2;
        //첫번째 숫자  나올때까지 push
        //첫번째 숫자 나오면 pop하고 그다음 숫자가 스택에 있는지 확인
        //만약 스택에 있는데 제일 처음 나오는게 아니면 no 출력
        //스택[0]에 있으면 다시 pop

        stack.push(1);
        print.add("+");
        while(!stack.isEmpty()){
            if(stack.search(arr[index]) == -1){
                stack.push(num);
                print.add("+");
                num++;
            }else if(stack.search(arr[index]) != -1 && stack.peek() != arr[index] ){
                print.add("NO");
                break;
            }
            if(arr[index] == stack.peek()){
                //result.add(stack.pop());
                stack.pop(); // result 활성화시키면 이거 비활성화해야함
                print.add("-");
                index++;
            }
            if(stack.isEmpty() && num <= n){
                stack.push(num);
                print.add("+");
                num++;
            }
        }
        if(print.contains("NO")){
            System.out.println("NO");
        }else{
            for(String s : print){
                System.out.println(s);
            }
        }
        //System.out.println(result);

    }
}
/*      stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        result.add(stack.pop());
        result.add(stack.pop());
        stack.push(5);
        stack.push(6);
        result.add(stack.pop());
        stack.push(7);
        stack.push(8);
        result.add(stack.pop());
        result.add(stack.pop());
        result.add(stack.pop());
        result.add(stack.pop());
        result.add(stack.pop());
        System.out.println(result);*/
