package javaPractice;
import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		
/*		
		//Simple math
		System.out.println((10.5+2*3)/(45-3.5));
		
		
		int y=10;
		int z=23;
		int v=45;
		int x=y+z*v;
		System.out.println("The result is "+x);
		
		//sum uptpo 10
		//int s=10;
		for(int i=0; i<=100; i++) {
			
			System.out.println(i);
			//s=s+i;
		}
		System.out.println(s);
		
		
		int a=4, b=4;
		System.out.println(Math.pow((a+b),2));
		double pi=4*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13));
		System.out.println(pi); 
		
		
		
		double perimeter=2*5.5*pi;
		System.out.println(perimeter);
		
		double area=Math.pow((5.5), 2)*pi;
		double are=5.5*5.5*pi;
		System.out.println(area);
		System.out.println(area);
		
		double width=4.5, height=7.9;
		area=width*height;
		System.out.println(area);
		
		/*
		double miles=14/1.6;
		System.out.println(miles);
		double avgSpeed=45.3/miles;
		System.out.println(avgSpeed);

		
	    double x, y, a, b,c,d,e,f;
//	    3.4x+50.2=44.5;
//	    2.1x+.55y=5.9;

		a=3.4;  b=50.2;  c=2.1;
		d=.55;  e=44.5;  f=5.9;
	
		x=(e*d-b*f)/(a*d-b*c);
		System.out.println("Value of x = " + x);
	
		y=(a*f-e*c)/(a*d-b*c);
		System.out.println("Value of y = " + y);
		
*/		
		
/*
		Scanner redius = new Scanner(System.in); 
		System.out.println("please input your redius: ");
		double red=redius.nextDouble();
		double area=Math.pow((red), 2)*Math.PI;
		System.out.println("Your Area is "+area);
		
		
		
		
		final double pi=Math.PI;
	 	System.out.println(pi);
		
		 int g=12;
		//System.out.println(g);
		
		g=34;
		System.out.println(g);
		
		
		 final int myNum = 15;
		
		
		 String firstName = "John ";
		 String lastName = "Doe";
		 String fullName = firstName + lastName;
		 System.out.println(fullName);
		 
		 int x = 5;
		 int y = 6;
		 System.out.println("x" + y); 
		 
		 boolean isJavaFun = true;
		 boolean isFishTasty = false;
		 System.out.println(isJavaFun);     // Outputs true
		 System.out.println(isFishTasty);
		 	
		
		//Month Practice Using User input
		System.out.println("Enter Your days: ");
		Scanner days= new Scanner(System.in);
		int day=days.nextInt();
		int month=day/30;
		int mMonth=day%30;
		System.out.println("Your Month is: "+month+" Month "+mMonth+" Days" );
		
		String[] cars = {"A", "B", "C", "D","E", "F", "G", "H","I", "J", "K", "L","M", "N", "O", "P","Q", "R", "S", "T","U", "V", "W", "X","Y", "Z", "@", "#", "%", "&","!", "$"};
		for (String i : cars) {
		  System.out.println(i);
		}
		if(i>11) {
//				break;
			}
		//i=(int) (prit)+1;
		String[] cars = {"A", "B", "C", "D","E", "F", "G", "H","I", "J", "K", "L","M", "N", "O", "P","Q", "R", "S", "T","U", "V", "W", "X","Y", "Z", "@", "#", "%", "&","!", "$"};
		for (int i=0; i<10; i++) {
			double prit=Math.random()*2;
			//System.out.println(prit);
//			
			//System.out.println(cars[prit]);
		System.out.print(cars[i])
//			
		}
		
		Scanner input = new Scanner(System.in); 
		System.out.println("please input your Result: ");
		double score=input.nextDouble();
		if(score>=80){
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
	
		//password genatator
		Scanner input = new Scanner(System.in); 
		System.out.println("please input your Result: ");
		int num=input.nextInt();
		int e=num/2;
		String[] cars = {"A", "B", "C", "D","E", "F", "G", "H","I", "J", "K", "L","M", "N", "O", "P","Q", "R", "S", "T","U", "V", "W", "X","Y", "Z", "@", "#", "%", "&","!", "$"};
		for (int i=e; i<num; i++) {
			int rand = (int)(Math.random() * 3);
			System.out.print(cars[rand]+rand*i);
		}	
		

		Scanner input = new Scanner(System.in); 
		System.out.println("please input your Number: ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("The Max is: "+num1);
		}else if(num2>num3 ){
			System.out.println("The Max is: "+num2);
		}else{
			System.out.println("The Max is: "+num3);
		}if(num1<num2 && num1<num3) {
			System.out.println("The Min is: "+num1);
		}else if(num2<num3) {
			System.out.println("The Min is: "+num2);
		}else {
			System.out.println("The Min is: "+num1);
		}
	
		Scanner input = new Scanner(System.in); 
		System.out.println("please input your Number: ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		
		System.out.println("The Maximum Number is: "+Math.max(Math.max(num1, num2), Math.max(num3,0)));
		System.out.println("The Minimum Number is: "+Math.min(Math.max(num1, num2), Math.max(num3,0)));
		
		int x=97;
		
		System.out.println((char)x);
		
		char[] arry= {'A','B','C',67,68,57};
		
		for(char i:arry) {
			System.out.print(i);
		}
		
	
		
		//System.out.println(Math.floor(-2.1));
		//5^3
		
		// rounded value
		double x=12.4667;
		double y=13.7874;
		//double round=Math.round(x*100)/100;
		double round1=Math.round(y*100)/100;
		double round=Math.round(x*100)/100;
		System.out.println(round);
		System.out.println(round1);
		
		int x1='a'+'b';
		System.out.println(x1);
		
		
		double b=Math.random()*50;
		System.out.println(b);
		
	// Create a Scanner
		  Scanner input = new Scanner(System.in);
		 
		  // Read an initial data
		 System.out.print("Enter an integer (the input ends if it is 0): ");
		 int data = input.nextInt();
		
		 // Keep reading data until the input is 0
		 int sum = 0;
		 while (data != 0){
			 
			 sum += data;
			 
		 // Read the next data
		System.out.print("Enter an integer (the input ends if it is 0): ");
		 data = input.nextInt();
		 }
		 
		
		// System.out.println("The sum is " + sum);
		 
		 Scanner evenOdd=new Scanner(System.in);
		 System.out.println("Input a integer number: ");
		 int num=evenOdd.nextInt();
		 
		 if(num%2==0) {
			 System.out.println(num+" is Even Number.");
		 }else {
			 System.out.println(num+" is Odd Number.");
		 }
		
		System.out.println("hi java");
		System.out.println("hi java");System.out.println("hi java");System.out.println("hi java");
		
		
		int factorial=1;
		for(int i=1; i<=5; i++) {
			factorial*=i;
		}
		System.out.println(factorial);
*/		
		Scanner input=new Scanner(System.in);
		System.out.println("please input a number: ");
		int number=input.nextInt();
		
		boolean isprime=true;
		if(number==1) {
			System.out.println("1 is not a prime number nor composite number; ");	
		}else if(number>1) {
			for(int i=2; i<number; i++) {
				if(number%i==0) {
					isprime=false;
					break;
				}
			}
			if(isprime) {
				System.out.println("is a prime number:");
			}else {
				System.out.println("not a prime number");
			}
			
		
		}
		
		
			
			
		
		
		
		
		
		//user define Function
		//myfunc();
		}

		public static void myfunc() {
			Scanner input = new Scanner(System.in); 
			System.out.println("please input your Number: ");
			int num1=input.nextInt();
			int num2=input.nextInt();
			int num3=input.nextInt();
			if(num1>num2 && num1>num3) {
				System.out.println("The Max is: "+num1);
			}else if(num2>num3 ){
				System.out.println("The Max is: "+num2);
			}else{
				System.out.println("The Max is: "+num3);
			}if(num1<num2 && num1<num3) {
				System.out.println("The Min is: "+num1);
			}else if(num2<num3) {
				System.out.println("The Min is: "+num2);
			}else {
				System.out.println("The Min is: "+num1);
			}
		}
	
}
