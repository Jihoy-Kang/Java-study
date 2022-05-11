package Baekjoon;
// 백준 4673번 문제 셀프넘버

public class SelfNumber {
    public static void main(String[] args) {
        int selfNum = 1;
        int input;
        int result;
        while(selfNum <= 10000){
            input = selfNum;
            result = selfNum;
            if(input <= 10){
                System.out.println(result);
            }else{
                while(input > 0) {

                    int pNum = input % 10;
                    input = input / 10;
                    result += pNum;

                }
                if(result >= 10000){
                    break;
                }
                System.out.println(result);
            }
            selfNum = selfNum + 1;
        }
    }
}

