package Baekjoon;

import java.io.*;
import java.util.*;

public class StringSet {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<String> setN = new HashSet<>();
        //HashSet<String> setM = new HashSet<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;


        for(int i = 0; i < N ;i++) setN.add(br.readLine());



        /*for(int j = 0; j < M ;j++) setM.add(br.readLine());
        setN.retainAll(setM); // 교집합
        System.out.println(setN.size());*//* // 이게 더 빠를거 같은데.......*/

        for(int j = 0; j < M ;j++) {
            if(setN.contains(br.readLine())){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}


   /*
    HashSet<Integer> ss = new HashSet();	// 1 2 3 4
    HashSet<Integer> ss2 = new HashSet();	// 3 4 5 6
    HashSet<Integer> ss3 = new HashSet();	// 1 2

		ss.add(1);
                ss.add(2);
                ss.add(3);
                ss.add(4);

                ss2.add(3);
                ss2.add(4);
                ss2.add(5);
                ss2.add(6);

                ss3.add(1);
                ss3.add(2);

		ss.addAll(ss2);	// (1 2 3 4) ∪ (3 4 5 6) = (1 2 3 4 5 6) 합집합
		for(int n : ss) System.out.print(n + " ");
		System.out.println();

		ss.retainAll(ss2);	// (1 2 3 4) ∩ (3 4 5 6) = (3 4) 교집합
		for(int n : ss) System.out.print(n + " ");
		System.out.println();

		ss.removeAll(ss2);	// (1 2 3 4) - (3 4 5 6) = (1 2) 차집합
		for(int n : ss) System.out.print(n + " ");
		System.out.println();
*/