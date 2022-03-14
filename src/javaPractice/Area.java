package javaPractice;

import java.util.Scanner;
	public class Area {
		Scanner input=new Scanner(System.in);
		double area;
		
		public double area(double redius) {
			if(redius<=0) {
				System.out.println("invalid Input,Enter valid Value: ");
				redius=input.nextInt();
			}
			if(redius>=0) {
				area=redius*redius*Math.PI;
			}
			return area;
		}
		public static void main(String[] args) {
		Area sc=new Area();
		Scanner input=new Scanner(System.in);
		System.out.println("please input redius: ");
		double val=input.nextInt();
		System.out.println(sc.area(val));
	}
	
		
}
