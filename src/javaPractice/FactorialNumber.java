package javaPractice;
import java.util.Scanner;
public class FactorialNumber {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter a number: ");
	int number=input.nextInt();
	
	long factorial = 1;
    for (int i = 1; i <= number; i++) {
    	factorial *= i;
    	//factorial=factorial*i
    	//System.out.println(factorial);
    }
    System.out.println("The factorial of "+number+" is: " + factorial);
}
}
