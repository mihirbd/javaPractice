package javaPractice;
import java.util.*;
public class ArraySorting {
public static void main(String args[]) {   
    int[][] matrix = {
            {2, 1, 3},
            {5, 4, 6},
            {8, 7, 9}
        };
for (int k = 0; k < matrix.length; k++) {
        for (int i= 0; i < matrix[k].length; i++) {
            for (int j = 0; j < matrix[k].length; j++) {
                if (matrix[k][i] < matrix[k][j]) {
                    int temp = matrix[k][i];
                    matrix[k][i] = matrix[k][j];
                    matrix[k][j] = temp;
                }
            }
        }
    }
System.out.println(Arrays.deepToString(matrix));
    
}   
}
