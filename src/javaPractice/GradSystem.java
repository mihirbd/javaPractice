package javaPractice;
import java.util.Scanner;
public class GradSystem {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		System.out.println("please input your Result: ");
		double score=input.nextDouble();
		if(score>=100) {
			System.out.println("Please input a valid Number That match with grading system.");
		}else if(score>=80){
			System.out.println("You Got A+");
		}else if(score>=70) {
			System.out.println("You Got A");
		}else if(score>=60) {
			System.out.println("You Got A-");
		}else if(score>=50) {
			System.out.println("You Got B");
		}else if(score>=40) {
			System.out.println("You Got C");
		}else if(score>=33) {
			System.out.println("You Got D");
		}else{
			System.out.println("you are Fail");
		}
	}
}
