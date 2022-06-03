package Seb;
import java.beans.PropertyEditorSupport;
import java.util.*;
import java.util.Arrays;

public class RockScissorsPaper {
    public static void main(String[] args) {
        String[] array = new String[]{"Rock", "Paper", "Scissors"};

        ArrayList<String[]> rockPaperScissors = new ArrayList<>();
        int round = 3;
        int cnt =0;
        int index = round-1;
        String[]   combination = new String[round];
        for(int i = 0; i<combination.length;i++){
            combination[i] = "Rock";
        }
        // 가위바위보 넣을 for문생성
            for(int i = 0; i<round ;i++){


                    for(String s : array){
                        combination[i] = s;
                        System.out.println(Arrays.toString(combination));
                        cnt++;
                    }


            }
        System.out.println(cnt);
    }
}
