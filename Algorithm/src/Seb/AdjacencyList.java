package Seb;

import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args) {

        int size = 0;
        int[][] edges = new int[][]{
                {0, 2, 0},
                {2, 4, 1},
                {1, 3, 1},
                {2, 1, 0},
        };

        //사이즈확인
        for(int i = 0; i < edges.length;i++){
            for(int j =0;j <2;j++){
                size = Math.max(size,edges[i][j]);
            }
        }

        //행렬생성
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i=0;i<=size;i++){
            matrix.add(new ArrayList<Integer>());
        }

        //행렬에 우선 0 넣어주기
        for(int i = 0; i <= size;i++){
            for(int j =0;j <=size;j++){
                matrix.get(i).add(0);
            }
        }

        //edge넣어주기
        int from = 0;
        int to = 0;
        int dir = 0;
        for(int i = 0; i < edges.length;i++){
            from = edges[i][0];
            to = edges[i][1];
            dir = edges[i][2];
                //edge확인해서 매트릭스 바꿔주기;
            if(dir==1){
                matrix.get(from).set(to,1);
                matrix.get(to).set(from,1);
            }else{
                matrix.get(from).set(to,1);
            }


        }

        System.out.println(matrix);
        //size확인해서 행렬 몇개 가지고갈건지
        //무향,방향 확인
        //
    }
}
