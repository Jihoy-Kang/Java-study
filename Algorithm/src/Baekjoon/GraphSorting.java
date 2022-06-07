package Baekjoon;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GraphSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i = 0;
        int arr[][] = new int[N][2];

        while(i < N){

            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
            i++;

        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) return o1[1]-o2[1]; // 음수 반환시 오름차순
                else return o1[0]-o2[0]; // 양수 반환시 내림차순
            }
        });
        for(int j = 0;j<arr.length;j++){
            /*System.out.println(Arrays.toString(arr[j]));*/
            System.out.println(arr[j][0]+" "+arr[j][1]);
        }

    }
}
