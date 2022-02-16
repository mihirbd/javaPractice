package javaPractice;
import java.util.Scanner;
public class sentinelValue{
	public static void main(String[] args) {
/*		// Create a Scanner
		  Scanner input = new Scanner(System.in);
		 
		  // Read an initial data
		 System.out.print("Enter an integer (the input ends if it is 0): ");
		 int data = input.nextInt();
		
		 // Keep reading data until the input is 0
		 int sum = 0;
		 while (sum<10){
			 sum += data;
			 
		 // Read the next data
		System.out.print("Enter an integer (the input ends if it is 0): ");
		 data = input.nextInt();
		 sum++;
		 }
	
		//even and odd numbers
		Scanner evenOdd=new Scanner(System.in);
		 System.out.println("Input a integer number: ");
		 int num=evenOdd.nextInt();
		 
		 if(num%2==0) {
			 System.out.println(num+" is Even Number.");
		 }else {
			 System.out.println(num+" is Odd Number.");
		 }
*/			 
		 //prime number
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter a positive number: ");
		 int number=input.nextInt();   
		 
		 boolean isPrime = true;

	        if (number == 1) {
	        	 System.out.println("1 is neither prime nor composite number. ");
	        }else if (number > 1) {
	            for (int i = 2; i<number; i++) {
	                if (number%i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if(isPrime){
	            	System.out.println(number+" is a prime number");
	            }else{
	            	System.out.println(number+" is a not prime number");
	            }
	        }else{
	        	System.out.println("The number is not a prime number.");
	        }
		 
		 
		 
		 
		 
		 
		 
		
	}
}
