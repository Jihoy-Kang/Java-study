package Baekjoon;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Stack;

public class StackSequence {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,5,3,4};
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        int num = 2;
        //첫번째 숫자  나올때까지 push
        //첫번째 숫자 나오면 pop하고 그다음 숫자가 스택에 있는지 확인
        //만약 스택에 있는데 제일 처음 나오는게 아니면 no 출력
        //스택[0]에 있으면 다시 pop

        stack.push(1);

        while(!stack.isEmpty()){
            if(stack.search(arr[index]) == -1){
                stack.push(num);
                num++;
            }else if(stack.search(arr[index]) != -1 && stack.peek() != arr[index] ){
                System.out.println("No");
                break;
            }
            if(arr[index] == stack.peek()){
                result.add(stack.pop());
                index++;
            }
        }
        System.out.println(stack);
        System.out.println(result);
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
