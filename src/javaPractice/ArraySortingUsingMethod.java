package javaPractice;

import java.util.Arrays;

public class ArraySortingUsingMethod {

	public static void main(String args[]) {
		int array[][] = { { 7, 8, 2, 1 }, { 0, 3, 2, 9 }, { 6, 5, 3, 2 }, { 8, 3, 7, 9 } };

		sortRowWise(array);
	}

    static int sortRowWise(int arr[][]) {
    	for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
                System.out.println();
        }
        
        return 0;
    }

}
