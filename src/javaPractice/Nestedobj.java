package javaPractice;
public class Nestedobj {
	public static void main(String[] args) {
		Outercls outobj=new Outercls();
		Outercls.innercls innobj=outobj.new innercls();
		innobj.incls();
		Outercls.ststicinner ststicobj=new Outercls.ststicinner();
		ststicobj.staticmathod();
		System.out.println(outobj.x);
	
	
	}
}
