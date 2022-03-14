package javaPractice;
import java.util.Scanner;
public class Sum {
int a=5;
int b=10;

Scanner input=new Scanner(System.in);
double area;


public int add() {
	int sum=a+b;
	return sum;
}

public double area(int redius) {
	
	if(redius<=0) {
		System.out.println("invalid Input,Enter valid Value: ");
		//redius=input.nextInt();
		
	}else { 
		redius=input.nextInt();
		 area=redius*redius*Math.PI;
		//return area;
	}
	return area;
}

//(0°C × 9/5) + 32 = 32°F
public double fahrenheit(int celsius ) {
	double fahrenheit=(celsius*9/5)+32;
	return fahrenheit;
}
//3.28/feet=meter
public float meter(float feet) {	
	float meter1=  (float) (feet/3.28);
	return meter1; 
}




public static void main(String[] args) {
	Sum add=new Sum();
	System.out.println("please input Redius: ");
	int val=add.input.nextInt();
	System.out.println("Area is: "+add.area(val));

	//System.out.println(add.add());
//	System.out.println("please input celcius: ");
//	int cel=input.nextInt();
//	float feet=4;
//	
//	System.out.println(cel+" celsius= "+add.fahrenheit(cel)+" fahrenheit");
//	System.out.println("meter: "+add.meter(feet));
}
}
