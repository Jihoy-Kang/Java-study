package DailyCoding;

import java.util.Arrays;

public class InsertDash {
    public static void main(String[] args) {
        //N-1이 짝수가 아닌 홀수 앞에 대시

        String str = "454793";
        char[] array = new char[]{'1','3','5','7','9'};
        String result = "";
        if(Character.getNumericValue(str.charAt(0))%2 !=0){
            result += "-"+str.charAt(0);
        }else {
            result += str.charAt(0);
        }
        for(int i=1; i<str.length();i++) {
            if(Character.getNumericValue(str.charAt(i))%2 != 0 && Character.getNumericValue(str.charAt(i-1))%2 != 0){
                result += "-" + str.charAt(i);
            }else{
                result+= str.charAt(i);
            }

        }
        System.out.println(result);
    }
}
