package Baekjoon;
import java.beans.PropertyEditorSupport;
import java.util.Scanner;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class PaintChessBoard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int min = 65;

        String[] board = new String[n];

        for(int p= 0;p < n;p++){
            board[p] = br.readLine();
        }
        for(int a = 0; a <= n-8;a++){
            for(int b = 0; b <= m-8;b++){
                count = 0;

                for(int i = a; i<a+8;i=i+2){
                    for(int j = b; j<b+8;j=j+2){
                        if(board[i].charAt(j)=='W'){
                            count++;
                        }
                    }
                }
                for(int z = a+1; z<a+8;z=z+2){
                    for(int x = b+1; x<b+8;x=x+2){
                        if(board[z].charAt(x)=='W'){
                            count++;
                        }
                    }
                }
                for(int i = a; i<a+8;i=i+2){
                    for(int j = b+1; j<b+8;j=j+2){
                        if(board[i].charAt(j)=='B'){
                            count++;
                        }
                    }
                }
                for(int z = a+1; z<a+8;z=z+2){
                    for(int x = b; x<b+8;x=x+2){
                        if(board[z].charAt(x)=='B'){
                            count++;
                        }
                    }
                }
                if(count>32){
                    count = 64-count;
                }
                if(min > count){
                    min = count;
                }
            }
        }

        System.out.println(count);
        System.out.println(min);

    }
}
//완전 탐색....
//진짜 할 수 있는거 다 찾아봐야하는건가.....?
