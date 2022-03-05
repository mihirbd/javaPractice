package javaPractice;

public class JavaOOP {

	String name;
	String className;
	int ID;
	int a;
	int b;
	int sum;
	
	public  JavaOOP() {
		name="Tarequl Islam";
		className="Java";
		ID=123456;
	}
	
	public  int sum(int a,int b ) {
		this.sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		JavaOOP in=new JavaOOP();
		System.out.println(in.ID+" "+in.className+" "+in.name);
		
		System.out.println(in.sum(2,4));
	}

	
	}
	
