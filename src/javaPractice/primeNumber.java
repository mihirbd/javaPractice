package javaPractice;
import java.util.Scanner;
public class primeNumber {
	public static void main(String[] args) {
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
	        }
	            else{
	        	System.out.println("The number is not a prime number.");
	        }
	}
	
}
