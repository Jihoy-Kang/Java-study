package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> list = new ArrayList<>();
        String  num = br.readLine();
        String result = "";

        for(int i = 0; i <num.length();i++){
            list.add(num.charAt(i));
        }
        Collections.sort(list,Collections.reverseOrder());
        for(int i= 0; i <list.size();i++){
            result += list.get(i);
        }
        System.out.println(result);
    }
}
