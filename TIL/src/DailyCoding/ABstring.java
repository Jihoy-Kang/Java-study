package DailyCoding;

import java.util.Arrays;

public class ABstring {
    public static void main(String[] args) {
        String str = "lane Borrowed";
        //A로 시작해서 - B로 끝나는 길이 5의 문자열
        //B로 시작해서 - A로 끝나는 길이 5의 문자열
        //대소문자 구분없음
        //공백도 한글자취급
        String[] array= str.split("");
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length-5;i++){
            System.out.println(array[i] + " " + array[i+4]);
            if(array[i].equalsIgnoreCase("a") && array[i+4].equalsIgnoreCase("b")){
                System.out.println(true);
            }else if(array[i].equalsIgnoreCase("b") && array[i+4].equalsIgnoreCase("a")){
                System.out.println(true);
            }else{
                continue;
            }
        }
    }
}
