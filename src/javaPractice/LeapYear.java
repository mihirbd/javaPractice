package javaPractice;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input a year: ");
		int year=input.nextInt();
		boolean isleapyear=year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		if(isleapyear) {
			System.out.println(year+" is a leap year.");
		}else {
			System.out.println(year+" is not a leap year.");
		}
	}
}
