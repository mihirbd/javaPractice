package javaPractice;
import java.util.Scanner;
public class PracticeArray {
public static void main(String[] args) {
//	
//	int sum=0;
//	int[]x=new int[10];
//	for(int i=0; i<x.length;i++) {
//		x[i]=i;
//		sum +=x[i];
//	}
//	System.out.println(sum);
/*
	 java.util.Scanner input = new java.util.Scanner(System.in);
	 System.out.print("Enter the number of items: ");
	 int n = input.nextInt();
	 double [] numbers = new double[n];
	 System.out.print("Enter the numbers: ");
	 
	 double sum = 0;
	 for (int i = 0; i < n; i++){ 
		 numbers[i] = input.nextDouble(); 
		 sum += numbers[i];
	 }
	 double average = sum / n; 
	 
	 
	 int count = 0;
	 for (int i = 0; i<n; i++) 
	 if (numbers[i] > average)
	 count++;
	
	 System.out.println("Average is " + average);
	 System.out.println("Number of elements above the average is "
	 + count);
*/
	Scanner input = new Scanner(System.in);
    //allow user  input;
    System.out.println("How many numbers do you want to enter?");
    int num = input.nextInt();

    int array[] = new int[num];
    System.out.println("Enter the " + num + " numbers now.");
    for (int i = 0 ; i < array.length; i++ ) {
       array[i] = input.nextInt();
    }

    System.out.println("These are the numbers you have entered.");
    printArray(array);
}
	public static void printArray(int arr[]){
	    for (int i = 0; i <arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}
}
