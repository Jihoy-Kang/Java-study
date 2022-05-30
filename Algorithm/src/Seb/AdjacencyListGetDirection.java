package Seb;

import java.util.*;

public class AdjacencyListGetDirection {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 0, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1},
            {0, 1, 0, 0},
        };


        Direction d = new Direction();
        System.out.println(d.direction(matrix,0,2));



    }
}
class Direction{
    public boolean direction(int[][] matrix,int from, int to) {

        /*if(matrix[from][to] == 1){
            return true;
        }else{
            Integer[] list = Arrays.stream(matrix[from]).boxed().toArray(Integer[]::new);
            from = Arrays.asList(list).indexOf(1);
            System.out.println(from);
            direction(matrix,from,to);
        }*/

        return false;

    }
}
