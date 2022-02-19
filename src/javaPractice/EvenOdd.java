package javaPractice;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		//even and odd numbers
		Scanner evenOdd=new Scanner(System.in); //Scanner method Call
		 System.out.println("Input a integer number: ");
		 int num=evenOdd.nextInt(); // get value from scanner Method
		 
		 if(num%2==0) {
			 System.out.println(num+" is Even Number.");
		 }else {
			 System.out.println(num+" is Odd Number.");
		 }
	}
}
