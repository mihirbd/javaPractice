package javaPractice;
import java.util.Scanner;
public class TimesTable {
public static void main(String[] args) {
/*	//using user input
 	Scanner input = new Scanner(System.in); 
	System.out.println("please input your Number for show the times Table: ");
	int num=input.nextInt();
	for(int a=1; a<=10; a++){
		System.out.println(num+" x "+ a+ " = "+ num*a );
	}
*/	
	
	//static Times Table
	for(int a=1; a<=10; a++){
		System.out.println("\nTimes Table for: "+a);
		for(int j=1; j<=10; j++){
			System.out.println(a+" x "+ j+ " = "+ a*j );
		}
	}
	
	
	
}}
