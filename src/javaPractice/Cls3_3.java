package javaPractice;

public class Cls3_3 {
	/*
	Static keyword Use only 4 type of Program
	1. Variable
	2. Method
	3. Block
	4. Nested Class
	*/
	int x=3; //Instance Variable create
	static int y=4;//Static variable create
	
	//Instance Method Create 
	public int mi(int a) {
		return x=a;
		//return x=a+1;
		
	}
	//Static Method create
	public static void mi2() {
		String t="Tarequl Islam";
		int Rool=23;
		System.out.println(t+" Roll: "+Rool);
	}
	public static void main(String[] args) {
		Cls3_3 acc=new Cls3_3();
		//System.out.println(acc.mi(7));
		System.out.println(acc.x);
		System.out.println(y);
		mi2();
	}
	
	
	
}
