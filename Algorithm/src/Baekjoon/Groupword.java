package Baekjoon;
import java.util.Scanner;

public class Groupword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int k =0; k < n ; k++){
            boolean check = true;
            String word = sc.next();
            if(word.length() <= 2){
                cnt++;
            }else{
                for(int i = 0; i < word.length()-1; i++){
                    char ch= word.charAt(i);
                    for(int j = i+1; j < word.length(); j++){
                        if(ch == word.charAt(j)){
                            if(word.charAt(j-1) != word.charAt(j)){
                                check = false;
                                break;
                            }
                        }
                    }
                }
                if(check==true) cnt++;
            }

        }
        System.out.println(cnt);
    }
}
