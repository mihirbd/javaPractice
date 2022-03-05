package javaPractice;
public class Inheritance2 extends Inheritance1{
	public Inheritance2(){
		String Degignation= "MD";
	}
	
	public static void main(String[] args)
	{
		Inheritance1 inheri=new Inheritance1();
		Inheritance1 inheri2=new Inheritance2();
		System.out.println("Name: "+inheri2.Degignation+inheri.getname());
		System.out.println("Cource: "+inheri.getcource("java EE"));
		System.out.println("Cource: "+inheri.getid(123634));
	}
}
