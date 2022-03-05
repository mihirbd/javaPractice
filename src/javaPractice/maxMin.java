package javaPractice;
import java.util.Scanner;
public class maxMin {
public static void main(String[] args) {
	/*	
	Scanner input = new Scanner(System.in); 
	System.out.println("please input Three Number: ");
	int num1=input.nextInt();
	int num2=input.nextInt();
	int num3=input.nextInt();
	
	
	if(num1>num2 && num1>num3) {
		System.out.println("The Max is: "+num1);
	}else if(num2>num3 ){
		System.out.println("The Max is: "+num2);
	}else{
		System.out.println("The Max is: "+num3);
	}
		
	if(num1<num2 && num1<num3) {
		System.out.println("The Min is: "+num1);
	}else if(num2<num3) {
		System.out.println("The Min is: "+num2);
	}else {
		System.out.println("The Min is: "+num3);
	}
*/	
	//Max Min using Built in Function
	Scanner input = new Scanner(System.in); 
	System.out.println("please Enter First Number: ");
	int num1=input.nextInt();
	System.out.println("please Enter Second Number: ");
	int num2=input.nextInt();
	System.out.println("please Enter Third Number: ");
	int num3=input.nextInt();
	
	System.out.println("The Maximum Number is: "+Math.max(Math.max(num1, num2),num3));
	System.out.println("The Minimum Number is: "+Math.min(Math.min(num1, num2),num3));

	
}
}
