package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        int size = 4;
        int[][] matrix;
        matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j) {
                    matrix[i][j] = 1;
                } else matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println(matrix[i][j]);
            }

        }
       /* for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println(matrix[i][j]);

            }
        }*/
    }
}
