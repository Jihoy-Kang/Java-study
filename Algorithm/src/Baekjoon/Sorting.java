package Baekjoon;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class Sorting {
    public static void main(String[] args) throws IOException{

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i<n;i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        for(int m : array){
            System.out.println(m);
        }*/

       /* BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine()); //Int
        int[] array = new int[n];
        for(int i = 0; i<n;i++) {
            array[i] = Integer.parseInt(bf.readLine()); //Int

        }
        Arrays.sort(array);
        for (int m : array) {
            System.out.println(m);
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int num : arr) {
            sb.append(num).append('\n');
        }

        System.out.println(sb);
    }
}
