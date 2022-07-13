package DailyCoding;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 7;
        int rotation = K % 4;

        int n = matrix[0].length;
        int[][] newMatrix = new int[n][n];
        while(rotation != 0){
            System.out.println(rotation);
            rotation--;
            for(int i = 0; i < n ; i++){
                int m = n;
                for(int j =0; j < n;j++){
                    m--;
                    newMatrix[i][m] = matrix[j][i];
                }
            }

            matrix = Arrays.copyOf(newMatrix, newMatrix.length);
        }


        /*for(int i = 0; i < n ; i++){
            for(int j =0; j < n;j++){
                System.out.println(matrix[i][j]);
            }
        }*/
    }
}
