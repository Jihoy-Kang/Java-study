package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CuttingLanCable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> cables = new ArrayList<>();

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int totalLength = 0;

        for(int i = 0; i<K;i++){
            int length = Integer.parseInt(br.readLine());
            cables.add(length);
            totalLength += length;
        }

        int minLength = 0;
        int midLength = 0;
        int maxLength = totalLength/N;

        int cableNum = 0;


        while(minLength < maxLength){
            cableNum = 0;
            midLength = (minLength + maxLength)/2;

            for(int cable : cables){
                cableNum += cable/midLength;
            }

            if(cableNum < N){
                maxLength = midLength;
            }else{
                minLength = midLength + 1;
            }
        }

        System.out.println(minLength -1);
    }
}

/*
    1차 시도

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> cables = new ArrayList<>();
        int totalLength = 0;

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i<K;i++){
            int length = Integer.parseInt(br.readLine());
            cables.add(length);
            totalLength += length;
        }

        int maxLength = totalLength/N;
        int cableNum = 0;
        if(maxLength >= Collections.min(cables)){
            maxLength = Collections.min(cables);
        }else{
            while(cableNum != N){
                cableNum = 0;
                for(int cable : cables){
                    cableNum += cable/maxLength;
                }
                if(cableNum != N){
                    maxLength--;
                }
            }
        }
        System.out.println(maxLength);
    }*/
/*

    2차 시도

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> cables = new ArrayList<>();
        int totalLength = 0;

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i<K;i++){
            int length = Integer.parseInt(br.readLine());
            cables.add(length);
            totalLength += length;
        }
        int minLength = 0;
        int midLength = 0;
        int maxLength = totalLength/N;
        int cableNum = 0;

        if(maxLength >= Collections.min(cables)){
            maxLength = Collections.min(cables);
        }else{

            while(maxLength-minLength!=1){
                cableNum = 0;
                midLength = (minLength + maxLength)/2;

                for(int cable : cables){
                    cableNum += cable/midLength;
                }

                if(cableNum < N){
                    maxLength = midLength;
                }else{
                    minLength = midLength;
                }
            }

        }
        System.out.println(minLength);
    }*/
