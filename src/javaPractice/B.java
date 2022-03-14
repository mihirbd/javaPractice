package javaPractice;

public class B extends A{
String area;

public B() {
	super(123, "Tarequl Islam", "XI");
	this.area = "lakshmipur";
}
public static void main(String[] args) {
	B obj=new B();
	//Method calling when property is private 
	//obj.dysplay();
	System.out.println(obj.area+obj.Name+obj.Class+obj.id);
	
	
}
}
