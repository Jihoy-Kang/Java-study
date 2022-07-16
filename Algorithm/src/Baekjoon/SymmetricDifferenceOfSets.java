package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class SymmetricDifferenceOfSets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i <n ; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i <m ; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> setC = new HashSet<>(setA);
        setA.removeAll(setB);
        setB.removeAll(setC);
/*        System.out.println("n = " + n + "m = " + m);
        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);
        System.out.println("setC = " + setC);*/
        System.out.println(setA.size() + setB.size());
    }
}
