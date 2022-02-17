package javaPractice;
import java.util.Scanner;
public class loop {
public static void main(String[] args) {
/*	
 	//do while loop practice
 	int x=0;
	do {
		System.out.println(x);
		x++;
	}
	while(x<10);
*/
	
	//Times Table practice
	Scanner input = new Scanner(System.in); 
	System.out.println("please input your Number for show the times Table: ");
	int num=input.nextInt();
	
	for(int a=1; a<=10; a++){
		System.out.println(num+" x "+ a+ " = "+ num*a );
	}
	
	
	
}	
}
